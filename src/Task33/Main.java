package Task33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Rohan", 76),
				new Student("Rohit", 80),
				new Student("Rahu;", 84),
				new Student("Sumit", 50),
				new Student("Amit", 95),
				new Student("Ankit", 90)
				
				);
		
		List<Student> marks = students.stream()
								.filter(s->s.marks>  80)
								.collect(Collectors.toList());
		
		System.out.println("Students marks > 80 : " + marks);
		
		
		//2 names to uppercase
		List<String> names = Arrays.asList("rohit","sachin","ankit","satish");
		List<String> upperCaseNames =names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println("Names in uppercase"+ upperCaseNames);
		
		//3
		List<Integer> numbers = Arrays.asList(10,20,30,4,56,55);
		int sum = numbers.stream()
				.reduce(0, Integer::sum);
		
		System.out.println("Sum of all numbers : "+ sum);
		
		
		
		
		
	}
	
}
