import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, a = 1;
		System.out.println("Input number");
		number = sc.nextByte();
		sc.close();
		for (int i = 1; i <= number;i++) {
			System.out.print("*");
			if (a < number && a <= i) {
				System.out.println();
				a++;
				i = 0;
			}
			if (i == number) {
				System.out.println();
				number--;
				i = 0;
			}
		}
	}
}
