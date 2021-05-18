package util;

public class CurrencyConverter {

	public double totalValue;
	public double currency;
	public double amount;
	
	public double totalValue() {
		return (currency * amount / 100) * 106  ;
	}

	
	public String toString() {
		return "Amount to be paid in reais = " + String.format("%.2f%n", totalValue());
	}
}
