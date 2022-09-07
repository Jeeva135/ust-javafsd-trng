package week2day3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <Integer> s =new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		
		for(int i:s) {
			System.out.println(i);
		}
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
