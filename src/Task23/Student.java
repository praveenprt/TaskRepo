package Task23;

	import java.util.*;

	public class Student implements Comparable<Student> {
	    String firstName;
	    String lastName;
	    int age;
	    double height;

	    public Student(String firstName, String lastName, int age, double height) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	        this.height = height;
	    }
	    @Override
	    public int compareTo(Student other) {
	        return Integer.compare(this.age, other.age);
	    }

	    @Override
	    public String toString() {
	        return firstName + " " + lastName + " (Age: " + age + ", Height: " + height + ")";
	    }
	}

	class SecondCharacterComparator implements Comparator<Student> {
	    @Override
	    public int compare(Student s1, Student s2) {
	        char c1 = s1.firstName.length() > 1 ? s1.firstName.charAt(1) : s1.firstName.charAt(0);
	        char c2 = s2.firstName.length() > 1 ? s2.firstName.charAt(1) : s2.firstName.charAt(0);
	        return Character.compare(c1, c2);
	    }
	

	
}
