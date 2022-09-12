package week3day1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Exception_example11 {
	public static void main(String args[]) {
		String data="This is the data in the output file";
		
		try {
			FileWriter file=new FileWriter("output.txt");
			BufferedWriter output =new BufferedWriter(file);
			
			output.write(data);
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
