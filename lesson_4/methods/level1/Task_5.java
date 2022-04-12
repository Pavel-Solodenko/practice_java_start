import java.util.Scanner;

public class Task_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		String str = sc.nextLine();
		sc.close();
		System.out.println(Words(str));
	}
	static int Words(String text) {
		int kol = 0;
		char k [];
		String [] t = text.split(" ");
		for (int i = 0;i < t.length; ++i) {
			k = t[i].toCharArray();
			if (k.length  > 2) {
				kol++;
			}
		}
		return kol;
	}
}
