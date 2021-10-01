package application;

import java.util.Scanner;
import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Insira as informações da conta");
			System.out.print("Número: ");
			Integer numero = sc.nextInt();
			sc.nextLine();
			System.out.print("Titular: ");
			String titular = sc.nextLine();
			System.out.print("Saldo inicial: ");
			Double saldo = sc.nextDouble();
			System.out.print("Insira o limite para saque: ");
			Double limiteSaque = sc.nextDouble();
			Account account = new Account(numero, titular, saldo, limiteSaque);

			System.out.print("Insira o valor para saque: ");
			Double valor =  sc.nextDouble();
			account.saque(valor);

			System.out.printf("Saldo atual: R$" + String.format("%.2f", account.getSaldo()));
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Dados inválidos, tente novamente");
		}

		sc.close();
	}

}
