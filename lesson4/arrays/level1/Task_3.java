public class Task_3 {
	public static void main(String[] args) {
		int a [] = new int [15];
		int b [] = new int [30];
		int n = 0;;
		for (int i = 0; i < a.length; ++i) {
			a [i] = (int) ((int) 1 + Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < a.length; ++i) {
			b [i] = a[i];
		}
		System.out.println();
		for (int i = 15; i < b.length; ++i) {
			b [i] = b[n] * 2;
			n++;
		}
		System.out.println("Output array");
		for (int i = 0; i < b.length; ++i) {
			System.out.print(b[i] + " ");
		}
	}
}
