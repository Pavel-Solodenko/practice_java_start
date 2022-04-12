import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		double x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input x and y");
		x = sc.nextDouble();
		y = sc.nextDouble();
		sc.close();
		if ( (Math.pow(x,2) + Math.pow(y, 2)) < Math.pow(4, 2)) {
			System.out.println("Point in the circle");
		}
		else {
			System.out.println("Point not in the circle");
		}
	}
}
