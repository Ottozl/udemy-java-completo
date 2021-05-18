import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	   int y = 32;
	   String nome = "Maria";
	   int idade = 31;
	   double renda = 4000.0;
	   
		
	   
	   double x = 10.35784;
			   
	   System.out.println("Olá, Mundo!");
	   
	   System.out.println(y);
	   
	   System.out.println(x);
	   
	   System.out.printf("%.2f%n", x);
	   Locale.setDefault(Locale.US);
	   System.out.printf("%.4f%n", x);
	   
	   System.out.println("Resultado igual a " + x + " metros!");
	   System.out.printf("Resultado = %.2f metros%n", x);
	   System.out.printf("%s tem %d anos e recebe R$ %.2f reais%n", nome, idade, renda);
	}

}
