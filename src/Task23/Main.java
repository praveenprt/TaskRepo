package Task23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rahul", "Sharma", 22, 5.4));
        students.add(new Student("Sumit", "Kumar", 20, 5.8));
        students.add(new Student("Rohit", "Kumar", 25, 5.7));
        students.add(new Student("Rohan", "verma", 23, 5.9));

        Collections.sort(students);
        System.out.println("Sorted by Age (Natural Order):");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, new SecondCharacterComparator());
        System.out.println("\nSorted by Second Character of First Name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
