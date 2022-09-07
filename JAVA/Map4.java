package week2day3;

import java.util.LinkedHashMap;

public class Map4 {
	public static void main(String args[]) {
		LinkedHashMap<String,Integer>evenNumbers=new LinkedHashMap<>();
		evenNumbers.put("Two",2);
		evenNumbers.put("Four", 4);
		System.out.println("LinkedHashMap1:"+evenNumbers);
		
		LinkedHashMap<String,Integer>numbers=new LinkedHashMap<>(evenNumbers);
		evenNumbers.put("There",3);
		System.out.println("LinkedHashMap2:"+numbers);
		
		
	}

}
