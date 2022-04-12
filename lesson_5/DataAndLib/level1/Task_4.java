public class Task_4 {
	public static void main(String[] args) {
		String s ;
		for (int i = 2; i < 12; ++i) {
			s = "%." + i + "f";
			System.out.println(String.format(s,Math.PI));
		}
	}
}
