import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Task_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "C:\\eclipse_present_projects\\Files_dz\\a.txt";
//		File fl = new File(path);
		int a[][] = new int [3][3];
		a = FillArray(a,sc);
		sc.close();
		try (PrintWriter pw = new PrintWriter(path)) {
			for (int i = 0; i < a.length; ++i) {
				for (int j = 0; j < a.length; j++ ) {
					pw.print(a[i][j] + " ");
				}
				pw.println();
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	static int [][] FillArray(int a[][], Scanner sc) {
		System.out.println("Enter array 3x3");
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a.length; ++j) {
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}
}
