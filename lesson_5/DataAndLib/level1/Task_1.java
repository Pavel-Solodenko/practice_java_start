import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Task_1 {
	public static void main(String[] args) {
		Date date = new Date();
		int a = 0;
		boolean year = false;
		SimpleDateFormat sdf = new SimpleDateFormat("MM");
		String str = sdf.format(date);
		a = Integer.parseInt(str);
		if (a == 1) {
			a = 12;
			year = true;
		}
		else {
			a = a - 1;
		}
		str = Integer.toString(a);
		sdf.applyPattern("dd");
		String s = sdf.format(date);
		str = s + " " +str;
		sdf.applyPattern("YYYY");
		s = sdf.format(date);
		a = Integer.parseInt(s);
		if (year == true) {
			a = a - 1;
		}
		s = Integer.toString(a);
		str = str + " " + s;
		sdf.applyPattern("dd MM yyyy");
		long all = date.getTime();
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			System.out.println(e);
		}
		long part = date.getTime();
		part = all - part;
		System.out.println(part);
	}
}
