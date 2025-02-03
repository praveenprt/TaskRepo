package Task13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class ReadFile {

	
	public static void main(String[] args) {
	
	try {
		BufferedWriter bw = new BufferedWriter(new FileWriter("Example1.txt"));
		bw.write("This is a sample of program");
		bw.newLine();
		bw.write("2 This is a sample of program");
		bw.newLine();
		bw.write("3 This is a sample of program");
		bw.newLine();
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("Example1.txt"));
		int count=0;
		String line;
		while ((line = br.readLine())!= null ){
			System.out.println(line);
			count++;

		}
		System.out.println(count + " lines" );
		br.close();
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	}
}
