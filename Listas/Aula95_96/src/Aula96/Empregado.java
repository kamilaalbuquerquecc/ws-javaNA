package Aula96;

public class Empregado {
	private int id;
	private String nome;
	private double salario;
	public Empregado() {
		
	}
	public Empregado(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	public void aumentoSalario(double porcentagem) {
		salario=salario+(salario*porcentagem/100);
	}
	
	

}
