import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c, b;
		byte x;
		System.out.println("Enter size array");
		x = sc.nextByte();
		int a [] = new int [x];
		System.out.println("Enter array");
		for (int i = 0; i < a.length; ++i) {
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Output array before");
		for (int i = 0; i < a.length; ++i) {
			System.out.println(a[i] + " ");
		}
		for (int i = 0; i < a.length / 2; ++i) {
			c = a[i];
			b = a[(a.length - 1) - i];
			a[i] = b;
			a[(a.length - 1) - i] = c;
		}
		System.out.println("Output array after");
		for (int i = 0; i < a.length; ++i) {
			System.out.println(a[i] + " ");
		}
	}
}
