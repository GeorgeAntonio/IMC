package br.ufrn.imd.dominio;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	
	public Pessoa() {}
	
	public Pessoa(String nome, double peso, double altura) {
		this.nome= nome;
		this.altura= altura;
		this.peso= peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Olá, " + nome + " seu peso é: " + peso + ", e sua altura é: " + altura;
	}
}
