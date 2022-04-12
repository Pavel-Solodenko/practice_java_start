import java.util.Scanner;

public class Task_1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sequence");
		String str = sc.nextLine();
		String s[] = str.split(",");
		int sequence[] = new int [s.length];
		int a = 0;
		for (String temp : s) {
			sequence[a] = Integer.parseInt(temp);
			a++;
		}
		Sequence1(sequence);
		
		sc.close();
	}
	static void Sequence1 (int sequence[]) {
		int a = 0;
		byte b = 0;
		for (int i = 0; i < sequence.length - 1; ++i) {
			a = sequence[i + 1] - sequence[i];
			if (a == 2) {
				b++;
			}
		}
		if (b > (sequence.length / 2) ) {
			System.out.println(sequence[sequence.length - 1] + 2);
		}
		else {
			Sequence2(sequence);
		}
	}
	static void Sequence2(int sequence[]) {
		int a = 0;
		byte b = 0;
		for (int i = 0; i < sequence.length - 1; ++i) {
			a = sequence[i + 1] - sequence[i];
			if (a == 3) {
				b++;
			}
		}
		if (b > (sequence.length / 2) ) {
			System.out.println(sequence[sequence.length - 1] + 3);
		}
		else {
			Sequence3(sequence);
		}
	}
	static void Sequence3(int sequence[]) {
		int a = 0;
		byte b = 0;
		for (int i = 0; i < sequence.length - 1; ++i) {
			if (sequence[i] == 0 || sequence[i+1] == 0) {
				break;
			}
			a = sequence[i + 1] / sequence[i];
			if (a == 2) {
				b++;
			}
		}
		if (b > (sequence.length / 2) ) {
			System.out.println(sequence[sequence.length - 1] * 2);
		}
		else {
			Sequence4(sequence);
		}
	}
	static void Sequence4(int sequence[]) {
		int a = 0;
		byte b = 0;
		for (int i = 0; i < sequence.length - 1; ++i) {
			if (sequence[i + 1] == 0 || sequence[i] == 0) {
				break;
			}
			a = sequence[i + 1] / sequence[i];
			if (a == 3) {
				b++;
			}
		}
		if ( b > (sequence.length / 2) ) {
			System.out.println(sequence[sequence.length - 1] * 3);
		}
		else {
			Sequence5(sequence);
		}
	}
	static void Sequence5(int sequence[]) {
		byte b = 0;
		for (int i = 0; i < sequence.length -1; ++i) {
			if ( Math.sqrt( (double) sequence[i + 1]) == Math.sqrt( (double) sequence[i]) + 1 ) {
				b++;
			}
		}
		if (b > sequence.length / 2) {
			System.out.println((int) Math.pow(Math.sqrt( (double) sequence[sequence.length - 1]) + 1, 2));
		}
		else {
			Sequence6(sequence);
		}
	}
	static void Sequence6(int sequence[]) {
		byte b = 0;
		for (int i = 0; i < sequence.length - 1; ++i ) {
			if (Math.round( Math.pow((double) sequence[i + 1], (double) 1/3) ) == Math.round( Math.pow((double) sequence[i],(double) 1/3) + 1) ) {
				b++;
			}
		}
		if (b > sequence.length / 2) {
			System.out.println(Math.round(Math.pow(Math.pow((double) sequence[sequence.length - 1], (double) 1/3) + 1, 3) ));
		}
		else {
			System.out.println("Unknown sequence");
		}
	}
}
