import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Input year");
		year = sc.nextInt();
		sc.close();
		if (year % 4 == 0 || year % 400 == 0) {
			System.out.println("Days in year - "+ 366);
			System.exit(0);
		}
		if (year % 100 == 0) {
			System.out.println("Days in year - " + 365);
			System.exit(0);
		}
		System.out.println("Days in year - " + 365);
	}
}
