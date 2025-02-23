package Task24;

import java.util.*;

public class Student implements Comparable<Student> {
 String firstName;
 String lastName;
 int age;
 int rollNumber;

 public Student(String firstName, String lastName, int age, int rollNumber) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
     this.rollNumber = rollNumber;
 }

 @Override
 public int compareTo(Student other) {
     return this.firstName.compareTo(other.firstName);
 }

 @Override
 public String toString() {
     return firstName + " " + lastName + " (Age: " + age + ", Roll No: " + rollNumber + ")";
 }
}


class AgeComparator implements Comparator<Student> {
 @Override
 public int compare(Student s1, Student s2) {
     return Integer.compare(s1.age, s2.age);
 }
}

class RollNumberComparator implements Comparator<Student> {
 @Override
 public int compare(Student s1, Student s2) {
     return Integer.compare(s1.rollNumber, s2.rollNumber);
 }
}




