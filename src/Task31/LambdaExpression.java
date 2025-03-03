package Task31;

import java.util.Iterator;

public class LambdaExpression {
	public static void main(String[] args) {
		Runnable checkEven = () -> {
			System.out.println("Even Numbers");
			for(int i=1; i<=20; i++) {
				if (i%2 == 0) {
					System.out.println(i);
					
				}
			}
			
			
		};
		Thread t1 = new Thread(checkEven);
		t1.start();
		
		
	}

}
