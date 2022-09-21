package week4day3;

import java.util.Optional;

public class OptionalClassExample4 {
	public static void main(String[] args) {
		Optional <String> strOptional=Optional.of("ONETWOTHREE");
		Optional <String>strOptional1=strOptional.map(String::toLowerCase);
		strOptional1.ifPresent(System.out::println);
	}
}
