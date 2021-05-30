package entities;

public class PessoaJuridica extends Dados {

	private Integer numeroDeFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double impostos() {
		if (getNumeroDeFuncionarios() <= 10.0) {
			return (getRendaAnual() * 0.16);
		} else {
			return (getRendaAnual() * 0.14);
		}

	}

	@Override
	public String valorPago() {
		return super.getNome() + ": $" + String.format("%.2f", impostos());

	}

}
