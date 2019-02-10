package Exercicio;


import java.util.Locale;
import java.util.Scanner;


public class exercicio002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int bedrooms = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		String name2 = sc.next();
		int age = sc.nextInt();
		Double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(bedrooms);
		System.out.println(price);
		System.out.println(name2);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
	}

}
