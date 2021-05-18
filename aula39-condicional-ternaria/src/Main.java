
public class Main {

	public static void main(String[] args) {
		
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
				System.out.printf("O valor do desconto é R$ %.3f%n", desconto);
	}
	
	
}
