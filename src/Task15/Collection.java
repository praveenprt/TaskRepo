package Task15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Collection {
	public static void main(String[] args) {
	
		 List<String> fruit = new ArrayList<>();
		 List<String> animal = new LinkedList<>();
		 
		 fruit.add("Apple");
		 fruit.add("Banana");
		 fruit.add("Pineapple");
		 
		 animal.add("Lion");
		 animal.add("Tiger");
		 animal.add("Dog");
		 
		 System.out.println("Arraylist Elemetns"+ fruit);
		 System.out.println("Linkedlist Elemetns"+ animal);
	
		 System.out.println("Arraylist Elemetns"+ fruit.get(1));
		 System.out.println("Linkedlist Elemetns"+ animal.get(2));
		 
		 
		 TreeSet<Integer> num = new TreeSet<>();
		 num.add(5);
		 num.add(7);
		 num.add(2);
		 num.add(3);
		 num.add(8);
		 num.add(6);
		 
		 System.out.println("Tree set elements "+num);
		 
		 HashMap<Integer, String> student = new HashMap<>();
		 student.put(110, "Yash");
		 student.put(120, "sumit");
		 student.put(105, "Raj");
		 
		 System.out.println("Student Details "+student);
		 
		 //count frequency
		 String sentence ="This is the java program and the program is complete";
		 
		 HashMap<String,Integer> count = new HashMap<>();
		 
		 String [] words = sentence.split("\\s+");
		 
		 for(int i=0; i<words.length; i++) {
			 String word = words[i];
			 if(count.containsKey(word)) {
				 count.put(word,count.get(word)+1);
			 }
			 else {
				count.put(word,1);
			}
			 }
	
		 String[] keys = count.keySet().toArray(new String[0]);
		 
		 for(int i=0; i<keys.length; i++) {
			 System.out.println(keys[i]+": " +count.get(keys[i]));
		 }
		
		 }
	
	
			
	
}
