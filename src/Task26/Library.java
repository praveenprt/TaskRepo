package Task26;

import java.util.*;

public class Library {

	    private Queue<String> books = new LinkedList<>();

	    public Library(List<String> initialBooks) {
	        books.addAll(initialBooks);
	    }
	    public synchronized void borrowBook(String studentName) {
	        while (books.isEmpty()) {
	            System.out.println(studentName + " is waiting for a book...");
	            try {
	                wait(); 
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }
	        String book = books.poll(); 
	        System.out.println(studentName + " borrowed " + book + " ");
	    }

	    public synchronized void returnBook(String studentName, String book) {
	        books.offer(book);
	        System.out.println(studentName + " returned " + book + " ");
	        notify(); //
	    }
	}

		class Student extends Thread {
	    private Library library;
	    private String studentName;
	    private String book;

	    public Student(Library library, String studentName, String book) {
	        this.library = library;
	        this.studentName = studentName;
	        this.book = book;
	    }

	    @Override
	    public void run() {
	        library.borrowBook(studentName);
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	        library.returnBook(studentName, book);
	    }
	}


