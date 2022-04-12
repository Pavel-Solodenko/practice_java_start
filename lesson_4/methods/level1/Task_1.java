public class Task_1 {
	public static void main(String[] args) {
		int a[] = {2,8,3,1,0,4,5,2,0,8,1,2,34,5,6,0};
		System.out.print(Max(a));
	}
	public static int Max(int a[]) {
		int max = 0;
		max = a[0];
		for (int i = 1; i < a.length; ++i) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
}
