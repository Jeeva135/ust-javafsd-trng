package week2day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Collections1 {
	public static void main(String args[]) {
		List lst=new ArrayList ();
		lst.add("abc");
		lst.add(123);
		lst.add(true);
		lst.add(3.4);
		
		Iterator itr=lst.iterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
			if (obj instanceof String)
				System.out.println(obj.toString().toUpperCase());
				//System.out.println(obj);
				else
					System.out.println(obj);
			//if (itr.next() instanceof String)
				//System.out.println(itr.next());
				//System.out.println(itr.next().toString().toUpperCase());
				
				//	System.out.println(itr.next());
			//	}
			
			
		
		}	
		
	/**	for (Object o:lst)
		{
			System.out.println(o+"\n");
		}
		System.out.println(lst);**/
	}
}
