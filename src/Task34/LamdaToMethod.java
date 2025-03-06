package Task34;

import java.util.function.Function;

public class LamdaToMethod {

	public static void main(String[] args) {
		Function <String,Integer> lambda = s -> Integer.parseInt(s);
		Function<String, Integer> methodRef = Integer::parseInt;
		
		System.out.println(lambda.apply("100"));
		System.out.println(methodRef.apply("200"));
	}
	
}
