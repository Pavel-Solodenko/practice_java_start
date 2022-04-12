public class Task_2 {
	public static void main(String[] args) {
		int a = 10;
		double b = 5.3;
		String str = "Sum is - ";
		System.out.println(Kont(a,b,str));
	}
	static String Kont(int a, double b, String str) {
		b = (double)a + b;
		str = str + Double.toString(b);
		return str;
	}
}
