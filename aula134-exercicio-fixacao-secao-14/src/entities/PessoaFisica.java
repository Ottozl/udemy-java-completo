package entities;

public class PessoaFisica extends Dados {

	private Double gastosComSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public Double impostos() {
		if (getRendaAnual() < 20000) {
			return (getRendaAnual() * 0.15) - (getGastosComSaude() * 0.5);
		} else {
			return (getRendaAnual() * 0.25) - (getGastosComSaude() * 0.5);
		}

	}

	@Override
	public String valorPago() {
		return super.getNome() + ": $" + String.format("%.2f", impostos());

	}

}