package curso;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String name = sc.nextLine();
		System.out.println("Qual sua idade?");
		int age = sc.nextInt();
		System.out.printf("Seja bem vindo %s, voce tem %d anos.", name,age);

		sc.close();
	}

}
