package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;


public class Program {
	
	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		System.out.println("Enter student data:");
		System.out.println("Name:");
			student.name = sc.nextLine();
		System.out.println("Grade one: ");
			student.gradeOne = sc.nextDouble();
		System.out.println("Grade two: ");
			student.gradeTwo = sc.nextDouble();
		System.out.println("Grade three: ");
			student.gradeThree = sc.nextDouble();

		System.out.println();
		System.out.println(student);
		
		if (student.finalGrade() >= 60.00) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		}

		sc.close();

		
	}
}
