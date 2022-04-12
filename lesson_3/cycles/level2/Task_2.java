public class Task_2 {
	public static void main(String[] args) {
		int b = 0;
		for (int i = 2; i <= 99;++i) {
			for (int a = 1; a < 100; ++a) {
				if (i % a == 0) {
					b++;
				}
			}
			if (b == 2) {
				System.out.print(" " + i);
			}
			b = 0;
		}
	}
}
