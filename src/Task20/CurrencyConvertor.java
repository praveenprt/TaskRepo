package Task20;

import java.math.BigDecimal;
import java.util.Map;

public class CurrencyConvertor {

	private static final Map<String,BigDecimal>  Rates = Map.of(
			"USD",BigDecimal.ONE,
			"EUR",new BigDecimal("0.85"),
			"GBP",new BigDecimal("0.75")
);

	
	
	public static BigDecimal
	convert (BigDecimal amount, String from, String to)  {
		if(!Rates.containsKey(from)|| !Rates.containsKey(to)) {
			throw new IllegalArgumentException("Invalid Currency code");
			}
		
		BigDecimal amountInUSD
		 = amount.divide(Rates.get(from),4,BigDecimal.ROUND_HALF_UP);
		 return amountInUSD.multiply(Rates.get(to)).setScale(4,BigDecimal.ROUND_HALF_UP);
		 }

	public static void main(String[] args) {
		
		BigDecimal amount = new BigDecimal("100");
		System.out.println("100 EUR to USD :" + convert(amount, "EUR", "USD"));
		System.out.println("100 USD to GBP :" + convert(amount,"USD", "GBP"));
		System.out.println("100 EUR to GBP :" + convert(amount, "EUR", "GBP"));
	}
	
	
}
