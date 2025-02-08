package Task14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderTool {
	
	public static String readFile(String filePath) throws IOException{
		return new String (Files.readAllBytes(Paths.get(filePath)));
	} 

	public static List<String> readFileLines(String filePath) throws IOException{

		return Files.readAllLines(Paths.get(filePath));
	}
	
		public static void main(String[] args) {
			String filePath = "example.txt";
			
			try {
				String content = readFile(filePath);
				System.out.println("File Content "+ content);
				
			List<String> lines = readFileLines(filePath);

			System.out.println("File Lines ");
			for(String line : lines) {
				System.out.println(line);
			}
			
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	
}
