import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {1,12,2,13,15,5,16,0,3,7,8,9,10};
		System.out.println("Enter search element");
		int el = sc.nextInt();
		sc.close();
		System.out.println("Index of element: "+Search(a,el));
	}
	static int Search(int a[], int el) {
		int i = -1;
		for (int k = 0; k < a.length; ++k) {
			if (a[k] == el) {
				i = k;
				break;
			}
		}
		return i;
	}
}
