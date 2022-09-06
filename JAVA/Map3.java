package week2day2;

import java.util.Map;
import java.util.TreeMap;

import javax.print.DocFlavor.STRING;

public class Map3 {
	public static void main (String args[]) {
		Map<String,Integer>values=new TreeMap<>();
		
		values.put("Second",2);
		values.put("First",1);
		System.out.println("Map using TreeMap:"+values);
		
		values.replace("First", 11);
		values.replace("second", 22);
		System.out.println("New Map:"+values);
		
		int removedValue=values.remove("First");
		System.out.println("Removed Value:"+removedValue);
	}

}
