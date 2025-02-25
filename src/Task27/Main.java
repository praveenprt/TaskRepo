package Task27;

public class Main {
	 public static void main(String[] args) {
	        Pair<String, Integer> person = new Pair<>("Alice", 25);
	        System.out.println("Original Pair: " + person);

	        person.setFirst("Bob");
	        person.setSecond(30);
	        System.out.println("Updated Pair: " + person);

	        Pair<Integer, Integer> numberPair = new Pair<>(10, 20);
	        System.out.println("Before Swap: " + numberPair);
	        Utils.swap(numberPair);
	        System.out.println("After Swap: " + numberPair);

	      System.out.println("Max of (10, 25, 15): " + Utils.findMaximum(10, 25, 15));
	        System.out.println("Max of (5.5, 2.2, 9.8): " + Utils.findMaximum(5.5, 2.2, 9.8));
	        System.out.println("Max of ('apple', 'orange', 'banana'): " + Utils.findMaximum("apple", "orange", "banana"));
	    }
	
}
