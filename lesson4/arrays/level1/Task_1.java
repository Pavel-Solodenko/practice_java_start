public class Task_1 {
	public static void main(String[] args) {
		int [] a = {0,5,2,4,7,1,3,19};
		byte n = 0;
		for (int i = 0; i < a.length; ++i) {
			for (int j = 1; j <= 20; ++j) {
				if (a[i] % j == 0) {
					n++;
				}
			}
			if (n == 2) {
				System.out.print(" "+ a[i]);
			}
			n = 0;
		}
	}
}
