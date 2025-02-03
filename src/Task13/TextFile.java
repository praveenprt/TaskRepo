package Task13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.function.BiConsumer;

	
public class TextFile {
	
	    public static void main(String[] args) {
Random random = new Random();
int count = 3;
	    	try {
	        	
	            FileOutputStream fos = new FileOutputStream("example.txt");
	            for(int i =0; i<count; i++) {
	            	
	            	int num =random.nextInt(100);
	            	fos.write(num);
	            }
	            fos.close();

	            FileInputStream fis = new FileInputStream("example.txt");
	            int content=0;
              int sum = 0;
	            while ((content = fis.read()) != -1) {
	            sum =content + sum;
//	            	System.out.println(content);
	            }
	            System.out.println(sum);
	            fis.close();

	        } catch (Exception e) {
	            System.out.println("File not found: " + e.getMessage());
	        } }
}
