package model.entities;

import model.exceptions.DomainException;

public class Account {

	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;

	public Account() {
	}

	public Account(Integer numero, String titular, Double saldo, Double limiteSaque) {

		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void deposito(Double valor) {
		saldo += valor;
	}

	public void saque(Double valor) {
		if (valor > saldo && valor > limiteSaque) {
			throw new DomainException("O valor é superior ao limite de saque da conta!");
		}
		if (valor > saldo) {
			throw new DomainException("Saldo insuficiente!");
		}
		if (valor > limiteSaque) {
			throw new DomainException("O valor é superior ao limite de saque da conta!");
		}
		saldo -= valor;
	}

}
