import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, a = 0, b = 0 , c = 0;
		boolean end = true;
		System.out.println("Input not even number");
		number = sc.nextInt();
		sc.close();
		for (int i = 1; i <=  number; ++i) {
			System.out.print("*");
			b++;
			if (b == number) {
				if (end == false) {
					break;
				}
				System.out.println();
				c++;
				for (int m = 1; m <= c; m++) {
					if (number == 1) {
						break;
					}
					System.out.print(" ");
				}
				i = 0;
				b = 0;
				number = number - 2;
			}
			if (number < 0) {
				c = c -2;
				//System.out.println();
				number = number + 4;
				for (int j = 1; j <= c; j++) {
					if (end == true) {
						System.out.print(" ");
						b++;
					}
					
					if (b == c) {
						for (int k = 1; k <= number; k++) {
							System.out.print("*");
						}
						b = 0;
						c--;
						j = 0;
						number = number + 2;
						System.out.println();
					}
					if (c < 1) {
						end = false;
						b = 0;
					}
				}
				
			}
		}
	}
}
