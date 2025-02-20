package Task22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorTasks {
	
	public static void main(String[] args) {
		//Iterator
		ArrayList<String> StudentNames = new ArrayList<>(Arrays.asList("Rahul","Rohit","Sumit","Aakash"));
		
		System.out.println("Student Names");
		Iterator<String> st = StudentNames.iterator();
		while (st.hasNext()) {
			System.out.println(st.next());
			
		}
		
		st = StudentNames.iterator();
		while (st.hasNext()) {
			if (st.next().startsWith("A")) {
				st.remove();
			}
			System.out.println("Student name after removal");
			for(String name : StudentNames) {
				System.out.println(name);
			}
			
			
		}
		System.out.println();
		
		//ListIterator
		
		LinkedList<String> cityNames = new LinkedList<>(Arrays.asList("Indore","Bhopal","Ratlam","Ujjain"));
				System.out.println("Cities (Forward Traversal) ");
				ListIterator<String> ct = cityNames.listIterator();
				while (ct.hasNext()) {
					System.out.println(ct.next());
				}
				System.out.println("Cities (Backawrd Traversal) ");
				while (ct.hasPrevious()) {
					System.out.println(ct.previous());
				}
				
				System.out.println();
		//Enumeration 
				Vector<String> countryNames = new Vector<>(Arrays.asList("India","Japan","China","Germany"));
				
				System.out.println("Country Names ");
				Enumeration<String> ce = countryNames.elements();
				while (ce.hasMoreElements()) {
					System.out.println(ce.nextElement());
				}
		
		
	}

}
