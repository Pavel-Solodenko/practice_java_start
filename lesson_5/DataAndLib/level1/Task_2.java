public class Task_2 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		String s;
		s = ArrayToString(a);
		System.out.println(s);
	}
	static String ArrayToString(int a[]) {
		String f = "[";
		for (int i = 0; i < a.length; ++i) {
			if (i == a.length - 1) {
				f = f + Integer.toString(a[i]) + "]";
			}
			else {
				f = f + Integer.toString(a[i]) + ", ";
			}
		}
		return f;
	}
}
