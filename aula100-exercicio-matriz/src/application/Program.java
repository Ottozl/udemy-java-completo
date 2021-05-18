package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas linhas? ");
		int row = sc.nextInt();

		System.out.println("Quantas colunas?");
		int column = sc.nextInt();

		int[][] mat = new int[row][column];
		System.out.println("Insira os " + row * column + " números:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("----------------------------");

		System.out.println("Qual número deseja verificar? ");
		int verify = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (verify == mat[i][j]) {

					System.out.println("Posição " + i + "," + j);
					if (i > 0) {
						System.out.println("Cima: " + mat[i - 1][j]);
					}
					if (i < mat.length - 1)
						System.out.println("Baixo: " + mat[i + 1][j]);
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
				}
			}

		}

		sc.close();
	}
}