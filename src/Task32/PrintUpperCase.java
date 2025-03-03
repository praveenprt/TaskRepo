package Task32;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintUpperCase {
public static void main(String[] args) {
	
	List<String> words = Arrays.asList("apple","mango","banana");
	
	Consumer<String> puc = word -> System.out.println(word.toUpperCase());
	
	words.forEach(puc);
	
}
}
