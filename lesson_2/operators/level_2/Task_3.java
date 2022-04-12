import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, number_in_memory;
		byte t, s, d, e;
		System.out.println("Input number");
		number = sc.nextInt();
		sc.close();
		if (number >= 1000 && number < 10000) {
			number_in_memory = number;
			if (number % 2 == 0) {
				t = (byte) (number / 1000);
				number = number - (t * 1000);
				s = (byte) (number / 100);
				number = number - (s * 100);
				d = (byte) (number / 10);
				number = number - (d * 10);
				e = (byte) number;
				if (t + s == d + e) {
					System.out.println(number_in_memory + " - Number is lucky");
				}
				else {
					System.out.println(number_in_memory + " - Number not lucky");
				}
			}
			else {
				System.out.println(number_in_memory + " - Number not even");
			}
		}
		else {
			System.out.println("Invalid number");
		}
	}
}
