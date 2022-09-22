package week4day4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.poi.ss.formula.functions.T;

public class Stream1 {
	public static void main(String[] args) {
		List<String> str= new ArrayList<>();
		str.add("Jeeva");
		str.add("Glory");
		str.add("Nahla");
		
		Predicate sp = s->s.equals("Glory");
		Stream<T> sr=str.stream().filter(sp);
		System.out.println(sr.collect(Collectors.toList()));
	}

}
