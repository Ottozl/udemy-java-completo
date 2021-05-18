package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		Employees[] vect = new Employees[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Enter ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter employee's name: ");
			String name = sc.nextLine();
			System.out.println("Enter employee's salary: ");
			Double salary = sc.nextDouble();

			vect[i] = new Employees(id, name, salary);
			System.out.println(vect[i]);

		}
		
	
		boolean idExists = false;
		do {
			
			System.out.println("Enter the employee ID that will have a salary increase: ");
			int bonus = sc.nextInt();

			for (int i = 0; i < vect.length; i++) {
				if (vect[i].getId() == bonus) {
					System.out.println("Enter percentage of the increase: ");
					double percentage = sc.nextDouble();

					vect[i].increaseSalary(percentage);
					idExists = true;

					System.out.println(vect[i].toString());
				}

			}
		} while (!idExists);
		sc.close();
	}
}
