import java.io.File;
	
public class Task_3 {
	public static void main(String[] args) {
		String path = "C:\\Users\\User\\Desktop\\2_семестр.3_курс";
		CheckCatalog(path);
	}
	static void CheckCatalog(String path) {
		File fl = new File(path);
		
		String [] list = fl.list();
		for (int i = 0; i < list.length; ++i) {
			
			File ff = new File(path + "\\" + list[i]);
			if (ff.isDirectory() == true) {
				System.out.println(list[i]);
			}
		}
	}
}
