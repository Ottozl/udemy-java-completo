package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		char ch;
		double demanda;
		int pvc = 0;
		int disjuntor = 0;
		int condutor = 0;
		int eletroduto = 0;
		String caixaDeMedicao = null;

		do {
			System.out.print("Digite o valor da demanda: ");

			demanda = sc.nextDouble();

			sc.nextLine();
			// n = valor digitado -> 32

			System.out.printf(
					"O valor da demanda é igual a " + String.format("%.2f", demanda) + ". Deseja continuar? (S/N) \n");

			ch = sc.next().toUpperCase().charAt(0);
		} while (ch != 'S');

		if ((demanda >= 0) && (demanda <= 32)) {
			pvc = 25;
			disjuntor = 50;
			condutor = 10;
			eletroduto = 40;
			caixaDeMedicao = "Polifásica";

		} else if ((demanda > 32) && (demanda <= 42)) {
			pvc = 0;
			disjuntor = 0;
			condutor = 0;
			eletroduto = 0;
			caixaDeMedicao = "Polifásica";
		}

		System.out.println("O dimensionamento será: ");
		System.out.println("PVC: " + pvc + " - Disjuntor: 3*" + disjuntor + " - Condutor: " + condutor
				+ " - Eletroduto: " + eletroduto + " - Caixa de medição: " + caixaDeMedicao);

		sc.close();
	}

}
