import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		byte n = 0;
		System.out.println("Enter text");
		a = sc.nextLine();
		sc.close();
		char [] t = a.toCharArray();
		for (int i = 0; i < t.length; ++i) {
			if (t[i] == 'b') {
				n++;
			}
		}
		System.out.println("Amount symbols 'b' - " + n);
	}
}
