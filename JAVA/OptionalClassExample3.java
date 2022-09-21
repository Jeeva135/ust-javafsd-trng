package week4day3;

import java.util.Optional;

public class OptionalClassExample3 {
	public static void main(String[] args) {
		Optional <String> emptyOption=Optional.empty();
		
		Optional<String> strOption =Optional.of("One");
		
		System.out.println(emptyOption.orElseGet(()->"optional null or ElseGet"));
		System.out.println(strOption.orElseGet(()->"Optional value orElseGet"));
	}

}
