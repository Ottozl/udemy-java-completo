package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();
		System.out.println("End of the program");

	}
	public static void method1() {
		System.out.println("***Method 1 Starts***");
		method2();
		System.out.println("***Method 1 Finishes***");


	}
	public static void method2() {
		System.out.println("***Method 2 Starts***");
		Scanner sc = new Scanner(System.in);
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		System.out.println("***Method 2 Finishes");
		sc.close();
	}
}
