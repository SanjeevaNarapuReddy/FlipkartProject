package Programming;

import java.io.File;
import java.io.IOException;

public class File_handling {

	public static void main(String[] args) throws Exception {
		File f = new File("D:\\SoftWare");
		f.mkdir();
		System.out.println("floder created");
		File f1 = new File("D:\\SoftWare\\Manual Testing.txt");
		f1.createNewFile();
		System.out.println("folder created");
		File f2 = new File("D:\\SoftWare\\Manual Testing\\automation.txt");
		f1.createNewFile();
		System.out.println("folder created");
		System.out.println(f2.exists());
		if(f2.exists())
		{
			f2.delete();
			
		}
	}

}
