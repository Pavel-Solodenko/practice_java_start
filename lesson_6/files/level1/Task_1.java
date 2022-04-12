import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text, if typing finished enter - Exit");
		String path = "C:\\eclipse_present_projects\\Files_dz\\a.txt", text = sc.nextLine();
		File fl = new File(path);
		if (fl.exists() == false) {
			try {
				fl.createNewFile();
			}
			catch (IOException e) {
				System.out.println(e);
			}
		}
		try (PrintWriter pw = new PrintWriter(path);) {
			while (!text.equals("Exit")) {
				pw.println(text);
				 text = sc.nextLine();
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		sc.close();
	}
}
