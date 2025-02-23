package Task24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Task24.Student;

public class Main {
	public static void main(String[] args) {
	     List<Student> students = new ArrayList<>();
	     students.add(new Student("Rahul", "Sharma", 22, 104));
	        students.add(new Student("Sumit", "Kumar", 20, 108));
	        students.add(new Student("Rohit", "Kumar", 25, 107));
	        students.add(new Student("Rohan", "verma", 23, 105));

	    Collections.sort(students);
	     System.out.println("Sorted by Name (Natural Order):");
	     students.forEach(System.out::println);

	     students.sort(new AgeComparator());
	     System.out.println("\nSorted by Age:");
	     students.forEach(System.out::println);

	     students.sort(new RollNumberComparator());
	     System.out.println("\nSorted by Roll Number:");
	     students.forEach(System.out::println);

	     System.out.println("\nEven and Odd Numbers using Threads:");
	     NumberPrinter numberPrinter = new NumberPrinter();
	     Thread evenThread = new Thread(() -> numberPrinter.printEvenNumbers());
	     Thread oddThread = new Thread(() -> numberPrinter.printOddNumbers());

	     evenThread.start();
	     oddThread.start();
	 }
}
