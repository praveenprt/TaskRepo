package Task32;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Person {

	String name;
	
	public Person(String name) {
		this.name = name;
		
	}
	
	public String getName() {
	 return name;	
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		
		List<Person> person = Arrays.asList(

				new Person("Rohit"),
				new Person("Sumit"),
				new Person("Rahul")
				
				);
		
		
		Comparator<Person> co = (p1,p2)->
		Character.compare(p1.getName().charAt(1), p2.getName().charAt(1));
		
		person.sort(co);
		
		System.out.println(person);
		
		
		
		
	}
	
	
	
}
