package Task26;

import java.util.Arrays;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
	        List<String> books = Arrays.asList("Java Programming", "Data Structures", "Operating Systems");
	        Library library = new Library(books);

	        Student s1 = new Student(library, "Amit", "Java Programming");
	        Student s2 = new Student(library, "Priya", "Data Structures");
	        Student s3 = new Student(library, "Vikram", "Operating Systems");
	        Student s4 = new Student(library, "Sneha", "Machine Learning");

	        s1.start();
	        s2.start();
	        s3.start();
	        s4.start();
	    }
	}

