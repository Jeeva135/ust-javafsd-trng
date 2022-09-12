package week3day1;

import java.io.File;

public class File_example2 {
	public static void main (String args[]) {
		File file= new File("C:\\Users\\ustjavafsdb219\\AB.txt");
		
		String[] fileList=file.list();
		
		for (String str:fileList) {
			System.out.println(str);
		}
	}

}
