package week3day1;

import java.io.File;

public class Exception_Example1 {
	
	public static void main (String args[]) {
		File file=new File("newFile.txt");
		
		try {
			boolean value =file.createNewFile();
			
			if (value) {
				System.out.println("The new file is created");
			}
			else {
				System.out.println("The file already exits");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
