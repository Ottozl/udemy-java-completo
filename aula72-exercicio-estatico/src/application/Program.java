package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		CurrencyConverter CC = new CurrencyConverter();

		System.out.print("What is the dollar price: ");
		CC.currency = sc.nextDouble();
		
		
		System.out.println();
		System.out.print("How many dollars will be bought? ");
		CC.amount = sc.nextDouble();
		
		
		System.out.println();
		System.out.print(CC);
		

		sc.close();
	}

}
