import java.util.Scanner;

public class Task_3 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Array length");
		int len = sc.nextInt(), a ,b, c = 1;	
		boolean t = false;
		int numbers[] = new int [len],p[] = new int[len];
		int komb[][] = new int [factorial(len)][len];
		FillArray(numbers, sc);
		len = factorial(len);
		//PrintArray(numbers);
		for (int i = 0;i != len; ++i) {
			if (i == 0) {
				for (int j = 0; j < len; ++j) {
					for (int k = 0;k < numbers.length; ++k) {
						komb[j][k] = numbers[k];
					}
				}
				continue;
			}
			for (int j = 0;j < numbers.length - 1; j++) {
				for (int k = 0;k < p.length; ++k) {
					p[k] = komb[i-1][k];
				}
				a = p[j];
				b = p[j+1];
				p[j] = b;
				p[j+1] = a;
				t = CheckDuplicate(p,komb,len);
				c = NumberString(komb,len,p.length);
//				if (i == 1 && j == 0) {
//					c = 0;
//				}
//				if (i == 1 && j == 1) {
//					c = 1;
//				}
				if (t == true) {
					for (int k = 0;k < p.length; ++k) {
						komb[c][k] = p[k];
					}
//					c++;
				}
					
//				if (t == false) {
//					for (int k = 0; k < numbers.length; ++k) {
//						komb[i][k] = numbers[k];
//					}
//				}	else {
//					for (int k = 0; k < numbers.length; ++k) {
//						komb[i+1][k] = numbers[k];
//					}
//				}
//				a = komb[i-1][j]; 
//				b = komb[i-1][j+1];
//				komb[j+1][j] = b;
//				komb[j+1][j+1] = a;
//				if (j == 1) {
//					t = false;
//				} else {
//					t = true;
//				}
				
				//if  not repeat >> write komb[i]
			}
//			c = 1;
		}
		System.out.println();
		for (int i = 0;i < len; ++i) {
			for (int j = 0; j < numbers.length; ++j) {
				System.out.print(komb[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
	
	static void FillArray(int num[], Scanner sc) {
		for (int i = 0; i < num.length; ++i) {
			System.out.println("numbers" + "[" + i + "]" + " = ");
			num[i] = sc.nextInt();
		}
	}
	static void PrintArray(int num[]) {
		System.out.println();
		for (int i = 0; i < num.length; ++i) {
			System.out.print(num[i] + " ");
		}
	}
	static int factorial(int fact) {
		int sum = 1;
		for (int i = 1; i <= fact; ++i) {
			sum = sum * i;
		}
		fact = sum;
		return fact;
	}
	static boolean CheckDuplicate(int p[],int komb[][], int len) {
		boolean t = false;
		int k = 0;
		for (int i = 0; i < len; ++i) {
			for (int j = 0; j < p.length; ++j) {
				if (p[j] == komb[i][j]) {
					k++;
				}
			}
			if (k == p.length) {
				t = false;
				break;
			} else {
				t = true;
			}
			k = 0;
		}
		return t;
	}
	static int NumberString(int komb[][],int len,int width) {
		int c = 1, k = 0;
		for (int i = 1; i < len; ++i) {
			for (int j = 0;j < width; ++j) {
				if (komb[i][j] == komb[0][j]) {
					k++;
				}
			}
			if (k == width) {
				c = i;
				break;
			}
			k = 0;
		}
		return c;
	}
}
