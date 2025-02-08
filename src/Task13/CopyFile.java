package Task13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
	public static void main(String[] args) {
		
		String originalFile ="C:\\Users\\nites\\eclipse-workspace\\TaskRepo\\src\\Task13\\download.jpg";
		String copyFile ="copyfile.jpg";
		
		try {
				
			
			FileInputStream fis = new FileInputStream(originalFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			


            byte[] buffer = new byte[1024];  
            int bytesRead;

             while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
			System.out.println("File Copied");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
