import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Width and Height");
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		Draw(a,b);
	}
static void Draw(int a,int b) {
		
		for (int i = 1; i <= a; ++i) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 2; i < b; ++i) {
			System.out.print("*");
			for (int k = 0; k < (a - 2) ; ++k) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int i = 1; i <= a; ++i) {
			System.out.print("*");
		}
	}
}
