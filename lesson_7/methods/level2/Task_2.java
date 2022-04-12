public class Task_2 {
	public static void main(String[] args) {
		int number, max = 0;	
		for (int a = 100; a != 1000; ++a) {
			for (int b = 100; b != 1000; ++b) {
				number = a * b;
				if (CheckPalindrome(number) == true && number > max) {
					max = number;
				}
			}
		}
		System.out.println(max);
	}
	static boolean CheckPalindrome(int number) {
		boolean pol = false;
		int a, i;
		if (number / 100000 < 1) {
			i = 10000;
			a = 5;
		}
		else {
			i = 100000;
			a = 6;
		}
		byte n[] = new byte [a], k = 0;
		for ( ;i != 0;) {
			a = number / i;
			if (a == 0) {
				i = i / 10;
				k++;
				continue;
			}
			number = number - (a * i);
			n[k] = (byte) a;
			k++;
			i = i / 10;
		}
		for (int j = 0; j < 3; ++j) {
			if (n[j] == n[(n.length - 1) - j] ) {
				if (j != 0 && pol == false) {
					break;
				}
				pol = true;
			}
			else {
				pol = false;
			}
		}
		return pol;
	}
}
