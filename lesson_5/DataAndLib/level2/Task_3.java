import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input numbers");
		String s = sc.nextLine();
		boolean fin = false;
		int m = 0;
		int a[] = new int [s.length()];
		a = StringToIntArray(s);
		for (int i = 0; i < a.length - 1; ++i) {
			if (a[i] == a[i + 1]) {
				++m;
			}
		}
		if (m != a.length - 1) {
			m = 1;
			String c[] = new String [a.length/2];
			c = DecompositionNumbers(c,a,m);
			if (CheckStringArray(c,m) == true) {
				System.out.println("min = " + c[0]);
			}
			else {
					do {
						++m;
						CleanArray(c);
						c = DecompositionNumbers(c,a,m);
						fin = CheckStringArray(c,m);
						if (fin == true) {
							System.out.println("min = " + c[0]);
						}
					} while (fin != true);
			}
		}
		else {
			System.out.println("Min = " + a[0]);
		}
		sc.close();
	}
	static int [] StringToIntArray(String s) {
		int a[] = new int [s.length()];
		for (int i = 0; i < a.length; ++i) {
			a[i] = Integer.parseInt(s.substring(i,i+1)); 
		}
		return a;
	}
	static boolean CheckStringArray(String c[],int m) {
		boolean y = false;
		int a = 0;
		for (int i = 0;i < c.length - 1; ++i) {
			if (c[i].equals(c[i+1]) == true) {
				++a;
			} 
			else {
				if (c[i+1].isEmpty() == true && c.length > 2) {
					++a;
				}
			}
		}
		if (a == c.length - 1) {
			y = true;
		}
		return y;
	}
	static String [] DecompositionNumbers(String c[], int a[], int m) {
		int it = 0;
		int i = m;
		for (; i < a.length;++i) {
			c[it] = WriteElementsToString(a,m,i);
			//c[it] = Integer.toString(a[i - m]) + Integer.toString(a[i]);
			//System.out.println(c[it]);
			i = i + m;
			++it;
		}
		return c;
	}
	static String WriteElementsToString(int a[],int m,int i) {
		String s = "";
		int j = i - m;
		for (; j <= i; ++j) {
			s = s + Integer.toString(a[j]);
			//s = s + l;
		}
		return s;
	}
	static String [] CleanArray(String c[]) {
		for (int i = 0; i < c.length; ++i) {
			c[i] = "";
		}
		return c;
	}
}
