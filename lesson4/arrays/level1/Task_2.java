import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte l;
		System.out.println("Input array lenght");
		l = sc.nextByte();
		sc.close();
		int [] a = new int [l];
		for (int i = 0; i < a.length; ++i) {
			System.out.println("Enter " + "a" + i);
			a[i] = sc.nextInt();
		}
		System.out.println("Output array");
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
	}
}
