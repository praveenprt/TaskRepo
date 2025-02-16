package Task20;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private final String firstName;
	private final String lastName;
	private final LocalDate dateOfBirth;

	public Person(String firstName, String lastName, LocalDate dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	public String getFullname() {
		return firstName + " " + lastName;
		
	}
	
	public int getAge () {
		return Period.between(dateOfBirth, LocalDate.now()).getYears();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	@Override
	public String toString() {
		return "Full Name = " + getFullname() + " Age =" + getAge() ;
	}
	
	
	
	
	
}
