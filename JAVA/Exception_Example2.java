package week3day1;

import java.io.FileReader;

public class Exception_Example2 {
	
	public static void main(String args[]) {
		char [] array=new char[100];
		
		try {
			FileReader input =new FileReader("input.txt");
			
			input.read(array);
			System.out.println("Data in the file");
			System.out.println(array);
			
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
