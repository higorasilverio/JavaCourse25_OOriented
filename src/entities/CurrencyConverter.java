package entities;

public class CurrencyConverter {
	
	private static final Integer IOF = 6;
	private double amount;
	private double dollarPrice;
		
	public CurrencyConverter(double amount, double dollarPrice) {
		this.amount = amount;
		this.dollarPrice = dollarPrice;
	}
	
	public double amoutToBePaid() {
		double valueWithoutTax = this.amount * this.dollarPrice;
		return valueWithoutTax + valueWithoutTax * ((double)IOF / 100);
	}
}
