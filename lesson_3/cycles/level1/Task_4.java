import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte width, height;
		System.out.println("Input width and height");
		width = sc.nextByte();
		height = sc.nextByte();
		sc.close();
		for (int i = 0; i < width; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 2; i < height; i++) {
			System.out.print("*");
			for (int a = 2; a < width; a++) {
				System.out.print(" ");
			}
			System.out.println("*"); 
		}
		for (int i = 0; i < width; i++) {
			System.out.print("*");
		}
	}
}
