import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input numbers");
		int a = sc.nextInt(), b = sc.nextInt(), len = 0, it;
		sc.close();
		String c = Integer.toBinaryString(a), d = Integer.toBinaryString(b);
		System.out.println(c + "    " + d);
		char r[] = c.toCharArray(); 
		char t[] = d.toCharArray();
		char j[] = new char[r.length];
		it = t.length - 1;
		for (int i = j.length - 1; i != -1; --i) {
			if (i >= j.length - t.length) {
				j[i] = t[it];
			}
			else {
				j[i] = '0';
			}
			--it;
		}
		for (int i = 0; i < r.length; ++i) {
			if (r[i] != j[i]) {
				++len;
			}
		}
		System.out.println("Hamming distance - " + len);
	}
}
