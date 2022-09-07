package week2day3;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylst_employee {
	public static void main(String args[]) {
		ArrayList<Integer>emid=new ArrayList<>();
		ArrayList<String> name=new ArrayList<>();
		
		emid.add(1);emid.add(2);emid.add(3);emid.add(4);emid.add(5);
		emid.add(6);emid.add(7);emid.add(8);emid.add(9);emid.add(10);
		emid.add(11);emid.add(12);emid.add(13);emid.add(14);emid.add(15);
		emid.add(16);emid.add(17);emid.add(18);emid.add(19);emid.add(20);
		
		
		name.add("Jeeva");
		name.add("eva");
		name.add("Glory");
		name.add("Nahla");
		name.add("Lisna");
		name.add("Anu");
		name.add("Minu");
		name.add("Binu");
		name.add("Sree");
		name.add("Merin");
		name.add("athulya");
		name.add("Athira");
		name.add("Alka");
		name.add("Grace");
		name.add("Jees");
		name.add("Anjana");
		name.add("Anju");
		name.add("Ann");
		name.add("Sruthy");
		name.add("Angel");
		
		Iterator<Integer>iterate=emid.iterator();
		Iterator<String>itr=name.iterator();
		
		while(iterate.hasNext()) {
			System.out.println("Employee "+iterate.next()+"  "+itr.next());
		}
		
	}
}
