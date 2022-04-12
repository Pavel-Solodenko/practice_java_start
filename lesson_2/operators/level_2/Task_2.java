import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float Ax = 0, Ay = 0, Bx = 4, By = 4, Cx = 6, Cy = 1;
		double x, y, AC, AB, CB;
		System.out.println("Input x and y");
		x = sc.nextDouble();
		y = sc.nextDouble();
		sc.close();
		AC = ( ( (x - Ax) * (Cy - Ay) ) - ( (Cx - Ax) * (y - Ay) ) );
		AB = ( ( (x - Ax) * (By - Ay) ) - ( (Bx - Ax) * (y - Ay) ) );
		CB = ( ( (x - Cx) * (By - Cy) ) - ( (Bx - Cx) * (y - Cy) ) );
		if (AC <= 0 && AB >= 0 && CB <= 0) {
			System.out.println("Point in triangular");
		}
		else {
			System.out.println("Point not in triangular");
		}
	}
}
