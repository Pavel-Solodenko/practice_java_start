import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task_2 {
	public static void main(String[] args) {
		String path = "C:\\eclipse_present_projects\\Files_dz\\a.txt";
		File fl = new File(path);
		String text = "";
		char letter;
		char symbols[] = {' ', ',','-'};
		char letters[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
						  'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		StringBuilder sb = new StringBuilder();
		try (BufferedReader bf = new BufferedReader( new FileReader(fl))) {
			String t = "";
			for (;(t = bf.readLine()) != null;) {
				sb.append(t).append(System.lineSeparator());
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		text = sb.toString();
		text = PointSplit(text);
		//System.out.println(text);
		text = SplitSymbols(text,'1');
		for (int i = 0; i < symbols.length; ++i) {
			text = SplitSymbols(text,symbols[i]);
		}
		char t[] = text.toCharArray();
		letter = MaxLetter(letters,t);
		text = DeleteLetterText(text,letter);
		do {
			char k[] = DeleteLetter(text,letter);
			letter = MaxLetter(letters,k);
			text = DeleteLetterText(text,letter);
		}
		while (text.isEmpty() != true);
	}
	static char [] DeleteLetter(String text,char letter) {
		String a[] = text.split(Character.toString(letter));
		text = "";
		for (int i = 0; i < a.length; ++i) {
			text = text + a[i];
		}
		char t[] = text.toCharArray();
		return t;
	}
	static char MaxLetter(char letters[], char t[]) {
		int number = 0, max = 0;
		String letter = "";
		for (int i = 0; i < letters.length; ++i) {
			for (int j = 0; j < t.length; ++j) {
				if (t[j] == letters[i]) {
					++number;
				}
			}
			if (number > max) {
				max = number;
				letter = Character.toString(letters[i]);
			}
			number = 0;
		}
		System.out.println(letter + " - " + max);
		return letter.charAt(0);
	}
	static String SplitSymbols(String a, char b) {
		if (b == '1') {
			String c[] = a.split(System.lineSeparator());
			a = "";
			for (int i = 0;i < c.length; ++i) {
				a = a + c[i];
			}
		}
		else {
			String c[] = a.split(Character.toString(b));
			//System.out.println(Character.toString(b));
			a = "";
			for (int i = 0;i < c.length; ++i) {
				a = a + c[i];
			}
		}
		return a;
	}
	static String PointSplit(String a) {
		String c[] = a.split("\\.");
		a = "";
		for (int i = 0; i < c.length; ++i) {
			a = a + c[i];
		}
		return a;
	}
	static String DeleteLetterText(String text,char letter) {
		String a[] = text.split(Character.toString(letter));
		text = "";
		for (int i = 0; i < a.length; ++i) {
			text = text + a[i];
		}
		return text;
	}
}
