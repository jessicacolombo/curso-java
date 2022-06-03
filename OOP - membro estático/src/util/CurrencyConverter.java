package util;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double dollarConversor (double quantityOfDollars, double dollarCotation) {
		return (quantityOfDollars * dollarCotation) + (quantityOfDollars * dollarCotation * IOF);
	}
	
}
