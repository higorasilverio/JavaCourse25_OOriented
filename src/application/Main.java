package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = scanner.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double amount = scanner.nextDouble();
		double result = CurrencyConverter.amoutToBePaid(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		scanner.close();
	}

}
