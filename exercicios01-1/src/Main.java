import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double l = sc.nextDouble();
		double c = sc.nextDouble();
		double v = sc.nextDouble();

		double area = l * c;
		double preco = area * v;

		area = (l * c);
		preco = (area * v);

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();
	}

}
