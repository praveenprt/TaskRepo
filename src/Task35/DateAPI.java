package Task35;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class DateAPI {
	
	public static Optional<String> getCurrentDate(){
			LocalDate currentDate = LocalDate.now();
			DateTimeFormatter fo = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			return Optional.of(currentDate.format(fo));
	
	}

	public static void main(String[] args) {
Optional<String> dateOb = getCurrentDate();
dateOb.ifPresentOrElse(date -> System.out.println("Current date: "+ date),
		()-> System.out.println("Could not retrieve data"));

	}
	
	

}
