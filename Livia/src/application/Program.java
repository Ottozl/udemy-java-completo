package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da passagem de trem: ");
		double passagemTrem = sc.nextDouble();

		System.out.print("Digite o valor da passagem de ônibus: ");
		double passagemOnibus = sc.nextDouble();

		System.out.print("Quantos dias por mês?");
		int diasPorMes = sc.nextInt();
		
		System.out.print("Qual o valor do salário? ");
		double salarioBruto = sc.nextDouble();

		double passagensPorDia = passagemTrem + passagemOnibus / 2;

		double salarioLiquido = salarioBruto - passagensPorDia * diasPorMes * 2;
		System.out.println("Valor final do salário = " + salarioLiquido);
	}

}
