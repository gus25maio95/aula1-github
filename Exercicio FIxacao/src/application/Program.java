package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

	public class Program {
		public static void main(String args[]){

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			CurrencyConverter currencyConverter = new CurrencyConverter();
			System.out.println("What is the dollar price? ");
			currencyConverter.price = sc.nextDouble();
			System.out.println("How many dollars will be bought? ");
			currencyConverter.dollars = sc.nextDouble();
			
			System.out.println();
			System.out.println(currencyConverter);

	
			sc.close();

		}

	}
