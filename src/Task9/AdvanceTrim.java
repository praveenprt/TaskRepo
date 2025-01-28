package Task9;

public class AdvanceTrim {

	public static String advanceTrim(String str) {
		if(str == null) {
			return null;
		}
		
		str = str.trim();
		
		return str.replaceAll("\\s+", " ");
		
	}
	public static void main(String[] args) {
		 
		String a = " Hello    world  ! ";
		advanceTrim(a);
		
		
		System.out.println("Before Trim :"+ a);

		System.out.println("after trim : " + advanceTrim(a));
 
	}

}
