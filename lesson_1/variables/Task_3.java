import java.util.Scanner;

public class Task_3{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double l,r;
		System.out.println("Input radius");
		r = sc.nextDouble();
		l = Math.PI * (r*2);
		System.out.println("Length circles = " + l);
		sc.close();
	}
}
