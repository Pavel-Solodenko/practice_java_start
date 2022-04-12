import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Input sides triangular");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Triangular is true");
		}
		else {
			System.out.println("Triangular is false");
		}
	}
}
