package Task32;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterNumber {
public static void main(String[] args) {
	List< Integer> numbers = Arrays.asList(5,12,16,48,12,2,4,5);
	
	Predicate<Integer> isGreater = num -> num>10;
	List<Integer>filteredNumbers = numbers.stream().filter(isGreater.negate()).collect(Collectors.toList());
	
	System.out.println(filteredNumbers);
}
}
