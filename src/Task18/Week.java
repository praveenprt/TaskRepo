package Task18;

public class Week {
	public static boolean isWeekend(Day day) {
		
		return (day == Day.SATURDAY || day == Day.SUNDAY);
		
	}
	
	public static void main(String[] args) {
	
		Day today = Day.WEDNESDAY;
		if(isWeekend(today)) {
			System.out.println(today + " is a weekend");
		}
		else {
			System.out.println(today +" is a weekday");
		}
		
}
}
