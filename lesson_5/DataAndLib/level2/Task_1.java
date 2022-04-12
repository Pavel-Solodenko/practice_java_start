import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean days = false, mounth = false, year = false;
		Date dateNow = new Date();
		Date dateIn = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		System.out.println("Input date ");
		String d = sc.nextLine(), s;
		sc.close();
		s = sdf.format(dateNow);
		try {
			dateIn = sdf.parse(d);
		}
		catch(ParseException e) {
			System.out.println(e);
		}
		sdf.applyPattern("dd");
		d = sdf.format(dateIn);
		s = sdf.format(dateNow);
		if (d.equals(s) == false) {
			days = true;
		}
		sdf.applyPattern("MM");
		d = sdf.format(dateIn);
		s = sdf.format(dateNow);
		if (d.equals(s) == false) {
			mounth = true;
		}
		sdf.applyPattern("yyyy");
		d = sdf.format(dateIn);
		s = sdf.format(dateNow);
		if (d.equals(s) == false) {
			year = true;
		}
		s = "";
		if (days == true) {
			s = "dd ";
		}
		if (mounth == true) {
			s = s + "MM ";
		}
		if (year == true) {
			s = s + "yyyy";
		}
		sdf.applyPattern(s);
		System.out.println(sdf.format(dateIn));
	}
}
