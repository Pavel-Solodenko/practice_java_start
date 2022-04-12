import java.util.Scanner;
import java.io.*;

public class Task_3 {
	public static void main(String[] args) {
		String art = "       _                        \n" +
                "       \\`*-.                    \n" +
                "        )  _`-.                 \n" +
                "       .  : `. .                \n" +
                "       : _   '  \\               \n" +
                "       ; *` _.   `*-._          \n" +
                "       `-.-'          `-.       \n" +
                "         ;       `       `.     \n" +
                "         :.       .        \\    \n" +
                "         . \\  .   :   .-'   .   \n" +
                "         '  `+.;  ;  '      :   \n" +
                "         :  '  |    ;       ;-. \n" +
                "         ; '   : :`-:     _.`* ;\n" +
                "      .*' /  .*' ; .*`- +'  `*' \n" +
                "      `*-*   `*-*  `*-*'";
		String path = "C:\\eclipse_present_projects\\Files_dz\\a.txt";
		File fl = new File(path);
		PrintArt(art,fl);
	}
	static void PrintArt(String art, File fl) {
		String a[] = art.split("\n");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fl))) {
			for (int i = 0; i < a.length; ++i) {
				bw.append(System.lineSeparator()).write(a[i]);
			}
		} 
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
