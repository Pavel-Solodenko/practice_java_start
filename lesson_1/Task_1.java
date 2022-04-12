import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int res_div;
		System.out.println("Enter number");
		number = sc.nextInt();
		res_div = number / 10000;
		System.out.println(res_div);
		number = number - (res_div*10000);
		res_div = number / 1000;
		System.out.println(res_div);
		number = number - (res_div * 1000);
		res_div = number / 100;
		System.out.println(res_div);
		number = number - (res_div * 100);
		res_div = number / 10;
		System.out.println(res_div);
		number = number - (res_div *10);
		System.out.println(number);
		sc.close();
	}
}

