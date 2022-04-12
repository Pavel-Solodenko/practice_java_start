import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b, c, kol = 1;
		byte x, y, choice = 0;
		System.out.println("Input size array (x = y) ");
		x = sc.nextByte();
		y = sc.nextByte();
		int  a [][] = new int [x][y];
		System.out.println("Enter array");
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Output array before");
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a.length; ++j) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("What do you want?");
		System.out.println("1 - turn on 90 ");
		System.out.println("2 - turn on 180 ");
		System.out.println("3 - turn on 270 ");
		System.out.println("0 - exit");
		choice = sc.nextByte();
		sc.close();
		if (choice == 1) {
			for (int k = 0; k < a.length; ++k) {
				for ( int i = kol; i < a.length; ++i) {
					b = a[i][k];
					c = a[k][i];
					a[i][k] = c;
					a[k][i] = b;
				}
				kol++;
			}	
		}
		if (choice == 2) {
			for (int k = 0; k < (a.length / 2); ++k) {
				for (int i = 0; i < a.length; ++i) {
					b = a[i][k];
					c = a[i][(a.length - 1) - k];
					a[i][k] = c;
					a[i][(a.length - 1) - k] = b;
				}
			}
		}
		if (choice == 3) {
			kol = a.length - 2;
			for (int k = 0; k < a.length; ++k) {
				for (int i = kol; i > -1; --i) {
					b = a[i][k];
					c = a[(a.length - 1) - k][(a.length - 1) - i];
					a[(a.length - 1) - k][(a.length - 1) - i] = b;
					a[i][k] = c;
				}
				kol--;
			}
		}
		if (choice == 0) {
			System.exit(choice);
		}
		System.out.println("Output array after");
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a.length; ++j) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
	}
}
}
