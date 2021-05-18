package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();

		Rent[] vect = new Rent[10];

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Insira o nome: ");
			String name = sc.nextLine();
			System.out.println("Insira o email");
			String mail = sc.nextLine();
			System.out.println("Escolha o número do quarto: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, mail);
			System.out.print("Rent #" + i + ": \n");
			System.out.println(vect[room] + "" + room + "\n");
		}
		System.out.println("Quartos ocupados: ");
		
		for (int i=0; i<10; i++) {
			if (vect[i] != null)
				
				System.out.println("Quarto #" + i + "" + vect[i]);
		}
		
		
		sc.close();

	}

}
