import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number,number_oper;
		byte st, dt, t, s, d, e;
		System.out.println("Input number");
		number = sc.nextInt();
		sc.close();
		number_oper = number;
		if (number >= 100000 && number <= 999999) {
			st = (byte) (number_oper / 100000);
			number_oper = number_oper - (st * 100000);
			dt = (byte) (number_oper / 10000);
			number_oper = number_oper - (dt * 10000);
			t = (byte) (number_oper / 1000);
			number_oper = number_oper - (t * 1000);
			s = (byte) (number_oper / 100);
			number_oper = number_oper - (s *100);
			d = (byte) (number_oper / 10);
			number_oper = number_oper - (d * 10);
			e = (byte) number_oper;
			if (st == e && dt == d && t == s) {
				System.out.println(number + " - Is polindrom");
			}
			else {
				System.out.println(number + " - Not polindrom");
			}
		}
		else {
			System.out.println("Invalid number");
		}
	}
}
