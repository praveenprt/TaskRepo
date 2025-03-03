package Task32;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Task14.WordsInText;

public class ConvertUpperCase {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple","banana","Pineapple");
		
		Function<String, String> toUpperCase = String :: toUpperCase;
		List<String> upperCasewords = words.stream()
				.map(toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println(upperCasewords);
 		
	}
	
}
