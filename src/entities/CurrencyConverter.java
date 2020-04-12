package entities;

public class CurrencyConverter {
	
	private static final Double IOF = 0.06;
	
	public static double amoutToBePaid(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}
}
