import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long factorial = 1;
		byte n;
		System.out.println("Input number");
		n = sc.nextByte();
		sc.close();
		if (n > 4 && n < 16) {
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			System.out.println(factorial + " - Factorial number - " + n);
		}
		else {
			System.out.println("Invalid number");
		}
	}
}
