package week4day2;

import java.util.ArrayList;
import java.util.List;

public class ForEach_example2 {
	public static void main(String[] args) {
		List <String> gamesList= new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hockey");
		System.out.println("---------Iterating by passinglambdas expression----------");
		gamesList.forEach(System.out::println);
		
	}

}
