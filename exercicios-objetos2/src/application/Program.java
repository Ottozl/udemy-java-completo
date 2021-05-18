package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employees employees = new Employees();
		
		System.out.print("Name: ");
		employees.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employees.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employees.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + employees);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employees.increaseSalary(percentage);

		System.out.println();
		System.out.println("Updated data: " + employees);
		sc.close();
	}

}
