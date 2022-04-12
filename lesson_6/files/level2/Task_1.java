import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task_1 {
	public static void main(String[] args) {
		String path = "C:\\eclipse_present_projects\\Files_dz\\a.txt";
		File fl = new File(path);
		boolean start = true;
		int height = 0, width = 0;
		String  text = "";
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(fl))) {
			for (; (text = br.readLine()) != null ;) {
				sb.append(text).append(System.lineSeparator());
				++height;
				if (start == true) {
					start = false;
					width = NoSpace(text).length();
				}
				
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		text = sb.toString();
		String t[] = text.split(System.lineSeparator());
		int num[][] = new int [height][width];
		for (int i = 0; i < t.length; ++i) {
			StringToInt(t[i],num,i);
		}
		for (int i = 0; i < height; ++i) {
			for (int j = 0; j < width; ++j) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
	static void StringToInt(String a,int b[][],int row) {
		a = NoSpace(a);
		char t[] = a.toCharArray();
		for (int i = 0; i < a.length(); ++i) {
			b[row][i] = Character.getNumericValue(t[i]);
		}
	}
	
	static String NoSpace(String a) {
		String b[] = a.split(" ");
		a = "";
		for (String temp : b) {
			a = a + temp;
		}
		return a;
	}
}
