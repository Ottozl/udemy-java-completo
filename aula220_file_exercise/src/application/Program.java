package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] itemNames = new String[] { "TV Led", "Video Game Chair", "iPhone X", "Samsung Galaxy 9" };
		Double[] itemPrices = new Double[] { 1290.99, 350.50, 900.00, 850.00 };
		int[] itemQuantity = new int[] { 1, 3, 2, 2 };
		FileReader fr = null;
		BufferedReader br = null;

		System.out.println("Enter the desired folder path: ");
		String strPath = sc.nextLine();
		System.out.println(strPath);

		boolean success = new File(strPath + "\\out").mkdir();
		System.out.println("Directory created sucessfuly: " + success);

		
		
		String fileDirectory = (strPath + "out\\summary.csv");
		System.out.println(fileDirectory);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileDirectory))) {
			for (int i = 0; i < itemNames.length; i++) {
				double temp = itemPrices[i] * itemQuantity[i];
				bw.write(itemNames[i] + ", " + temp);
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
