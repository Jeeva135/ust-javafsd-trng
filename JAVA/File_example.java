package week3day1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_example {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\ustjavafsdb219\\ABC.txt");
		
		
		try {
			FileOutputStream fstm=new FileOutputStream(f);
			byte[] b="This I am writing to file".getBytes();
			
			if (f.createNewFile())
			{
				System.out.println("New file created");
				fstm.write(b);
			}
			else {
				System.out.println("File exists");
				fstm.write(b);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
