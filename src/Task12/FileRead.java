package Task12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {

	public static void readFile(String fileName) throws IOException{
		File file = new File(fileName);
		
		FileReader fileReader = new FileReader(file);
		
		System.out.println("File Open ");
		fileReader.close();
		
		}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter file name");
		String fileName = s1.nextLine();
		
		try {
			readFile(fileName);
			
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		
		
	}
	
}