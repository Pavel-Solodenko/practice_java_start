import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, floor, entrance;
		System.out.println("Input number flat");
		number = sc.nextInt();
		sc.close();
		if (number < 1 || number > 144) {
			System.out.println("Not in this house");
			System.exit(0);
		}
		floor = number / 4;
		entrance = number / 36;
		if (number % 4 == 0) {}
		else {
			floor++;
		}
		if (number % 36 == 0) {}
		else {
			entrance++;
		}
		switch(entrance) {
		case 2: floor = floor - 9;
				break;
		case 3: floor = floor - 18;
				break;
		case 4: floor = floor - 27;
				break;
				default: 
					entrance = 1;
		}	
System.out.println("Entrance - " + entrance + System.lineSeparator() + "Floor - " + floor);
	}
}
