package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss\"");

		System.out.println("Enter rental data: ");
		
		String rentalData = sc.nextLine();
		
		

	}

}
