import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input binary number");
		String binary = sc.nextLine();
		sc.close();
		int a = Integer.parseInt(binary,2);
		System.out.println(a +  "-> " + binary);
	}
}
