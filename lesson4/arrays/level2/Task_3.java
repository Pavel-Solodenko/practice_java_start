import java.util.Scanner;

public class Task_3 {
	public static void  main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int  a = 0, b, n = 0;
		byte k = 0, cent;
		boolean hun = false, tho = false, mil = false;
		double number, c;
		System.out.println("Enter number");
		number = sc.nextDouble();
		if (number == 0) {
			System.out.print("Zero");
			System.exit(0);
		}
		if (number/1000000000 < 1) {
			b = (int) number;
			c = (number - b);
			c = (double) Math.round(c * 100) / 100;
			c = c * 100;
			cent = (byte) c;
			
			for (int i = 1000000000; i != 1;) {
				if (b / i >= 1 && b > 19) {
					if ( (b >= 100 && b < 1000) || hun == true) {
						a = b / i;
						n = b;
						b = a;
						hun = true;
					}
					
					if ( (b >= 1000 && b < 10000) || tho == true) {
						a = b / i;
						n = b;
						b = a;
						tho = true;
					}
					
					if ( (b >= 1000000 && b < 10000000) || mil == true) {
						a = b / i;
						n = b;
						b = a;
						mil = true;
					}
					
					if (b > 19 && b < 100) {
						if (tho == false && mil ==false) {
							a = b / i;
							a = a * i;
							a = b - a;
							b = b - a;
						}
						else {
							a = b / 10;
							a = a * 10;
							n = n - (a * i);
							a = b - a;
							b = b - a;
						}
						
						switch(b) {
						case 20: System.out.print(" Twenty ");
						break;
						case 30: System.out.print(" Thirty ");
						break;
						case 40: System.out.print(" Forty ");
						break;
						case 50: System.out.print(" Fifty ");
						break;
						case 60: System.out.print(" Sixty ");
						break;
						case 70: System.out.print(" Seventy ");
						break;
						case 80: System.out.print(" Eighty ");
						break;
						case 90: System.out.print(" Ninety ");
						break;
						}
						b = a;
					}
					
				}
				if (b < 13 ) {
					switch (b) {
					case 1: System.out.print("One");
					break;
					case 2: System.out.print("Two");
					break;
					case 3: System.out.print("Three");
					break;
					case 4: System.out.print("Four");
					break;
					case 5: System.out.print("Five");
					break;
					case 6: System.out.print("Six");
					break;
					case 7: System.out.print("Seven");
					break;
					case 8: System.out.print("Eight");
					break;
					case 9: System.out.print("Nine");
					break;
					case 10: System.out.print("Ten");
					break;
					case 11: System.out.print("Eleven");
					break;
					case 12: System.out.print("Twelve");
					break;
						}
					k++;
				}
					
				if ( (b > 12 && b < 20) ) {
					switch(b) {
					case 13: System.out.print("Thirteen");
					break;
					case 14: System.out.print("Fourteen");
					break;
					case 15: System.out.print("Fifteen");
					break;
					case 16: System.out.print("Sixteen");
					break;
					case 17: System.out.print("Seventeen");
					break;
					case 18: System.out.print("Eighteen");
					break;
					case 19: System.out.print("Nineteen");
						}
				}
				
				if (hun == true) {
					System.out.print(" Hundred ");	
					b = n - (a * i);
					hun = false;
					k--;
				}
				
				if (n >= 100000 && n < 1000000 && b < 1000  && tho == false && i == 100000) {
					System.out.print(" Thousand ");				}
				
				if (n >= 100000000 && n < 1000000000 && b < 1000 && mil == false && i == 100000000) {
					System.out.print(" Million ");
				}
				
				if (tho == true) {
					System.out.print(" Thousand ");
					b = n - (a * i);
					tho = false;
					k--;
				}
				
				if (mil == true) {
					System.out.print(" Million ");
					b = n - (a * i);
					mil = false;
					k--;
				}
				
				if (b >= 10000 && b < 100000 && b / i >= 1) {
					tho = true;
				}
				
				if (b >= 100000 && b < 1000000 && b / i >= 1) {
					hun = true;
					continue;
				}
				
				if (b >= 10000000 && b < 100000000 && b / i >= 1) {
					mil = true;
				}
				
				if (b >= 100000000 && b <1000000000 && b / i >= 1) {
					hun = true;
					continue;
				}
				
				if (k >= 1 || number < 20) {
					break;
				}
				
				
				i = i / 10;
			}
			
			if (number > 1) {
				System.out.print(" And ");
			}
			if (cent > 19 && cent < 100) {
				a = cent / 10;
				a = a * 10;
				a = cent - a;
				cent = (byte) (cent - a);
				
				switch(cent) {
				case 20: System.out.print("Twenty");
				break;
				case 30: System.out.print("Thirty");
				break;
				case 40: System.out.print("Forty");
				break;
				case 50: System.out.print("Fifty");
				break;
				case 60: System.out.print("Sixty");
				break;
				case 70: System.out.print("Seventy");
				break;
				case 80: System.out.print("Eighty");
				break;
				case 90: System.out.print("Ninety");
				break;
				}
				cent = (byte) a;
			}
			if (cent < 13) {
				switch (cent) {
				case 1: System.out.print(" One");
				break;
				case 2: System.out.print(" Two");
				break;
				case 3: System.out.print(" Three");
				break;
				case 4: System.out.print(" Four");
				break;
				case 5: System.out.print(" Five");
				break;
				case 6: System.out.print(" Six");
				break;
				case 7: System.out.print(" Seven");
				break;
				case 8: System.out.print(" Eight");
				break;
				case 9: System.out.print(" Nine");
				break;
				case 10: System.out.print( "Ten");
				break;
				case 11: System.out.print(" Eleven");
				break;
				case 12: System.out.print(" Twelve");
				break;
				}	
			}
			if (cent > 12 && cent < 20) {
				switch(cent) {
				case 13: System.out.print(" Thirteen");
				break;
				case 14: System.out.print(" Fourteen");
				break;
				case 15: System.out.print(" Fifteen");
				break;
				case 16: System.out.print(" Sixteen");
				break;
				case 17: System.out.print(" Seventeen");
				break;
				case 18: System.out.print(" Eighteen");
				break;
				case 19: System.out.print(" Nineteen");
					}
			}
			
			
			System.out.print(" Cents");
		}
		
		sc.close();
	}
}
