package Task14;

import java.io.BufferedReader;
import java.io.FileReader;

public class WordsInText {

	public static void main(String[] args) {
		
		String filename="example.txt";
		
		int count=0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = br.readLine()) != null) {
				String [] words = line.trim().split("\\s+");
				count = count + words.length;
				
			}
			
			System.out.println("total number of words in "+ filename +" - "+ count);
			
		} catch (Exception e) {
			System.out.println("Error reading file"+ filename);
		}
		
	}
}
