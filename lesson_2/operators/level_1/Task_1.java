import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, max;
		System.out.println("Input number a");
		a = sc.nextInt();
		System.out.println("Input number b");
		b = sc.nextInt();
		System.out.println("Input number c");
		c = sc.nextInt();
		System.out.println("Input number d");
		d = sc.nextInt();
		sc.close();
		if (a > b) {
			max = a;
		}
		else {
			max = b;
		}
		if (max > c) {
		}
		else {
			max = c;
		}
		if (max > d) {
		}
		else {
			max = d;
		}
		System.out.println("Max = " + max);
	}
}
