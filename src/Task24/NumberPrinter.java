package Task24;

public class NumberPrinter {
	 private final int MAX = 20; 
	 private int number = 1;
	 private final Object lock = new Object();

	 public void printOddNumbers() {
	     synchronized (lock) {
	         while (number < MAX) {
	             if (number % 2 == 1) {
	                 System.out.println("Odd: " + number);
	                 number++;
	                 lock.notify();
	             }
	             try {
	                 lock.wait();
	             } catch (InterruptedException e) {
	                 Thread.currentThread().interrupt();
	             }
	         }
	         lock.notify();
	     }
	 }

	 public void printEvenNumbers() {
	     synchronized (lock) {
	         while (number <= MAX) {
	             if (number % 2 == 0) {
	                 System.out.println("Even: " + number);
	                 number++;
	                 lock.notify();
	             }
	             try {
	                 lock.wait();
	             } catch (InterruptedException e) {
	                 Thread.currentThread().interrupt();
	             }
	         }
	         lock.notify();
	     }
	 }
	}
