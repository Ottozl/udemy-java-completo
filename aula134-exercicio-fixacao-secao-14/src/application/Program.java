package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Dados;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Dados> list = new ArrayList<>();

		System.out.print("Insira a quantidade de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Contribuinte #" + i + ":");
			System.out.print("Pessoa física ou jurídica? (PF/PJ): ");
			char ch = sc.next().toUpperCase().charAt(1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			if (ch == 'F') {
				System.out.print("Gastos com saúde: ");
				Double gastosComSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
			} else if (ch == 'J') {
				System.out.print("Número de funcionários :");
				Integer numeroDeFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
			}

		}
		System.out.println();
		System.out.println("Valor da contribuição");
		Double x = 0.0;
		for (Dados contribuintes : list) {
			System.out.println(contribuintes.valorPago());
			x += contribuintes.impostos();
		}
		System.out.printf("Total pago: $" + "%.2f", x);

		sc.close();
	}

}
