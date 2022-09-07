package week2day3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map6 {
	public static void main (String args[]) {
		Map<Integer,Float> m=new HashMap<>();
		
		m.put(1, 3.4f);
		m.put(2, 4.4f);
		m.put(3, 33.4f);
		
		Collection c =m.values();
		Iterator itr=c.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
