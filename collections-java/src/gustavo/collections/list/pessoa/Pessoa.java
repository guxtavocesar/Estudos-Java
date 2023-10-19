package gustavo.collections.list.pessoa;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
	
	// Atributos
	private String nome;
	private Integer idade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	@Override // Ordenação natural da classe
	public int compareTo(Pessoa p) {
		
		return Integer.compare(idade, p.getIdade());
	}
	
	public double getAltura() {
		return altura;
	}
	 
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome +
				"\n Idade: " + idade +
				"\n altura: " + altura;
	}
	
}

class ComparatorPorAltura implements Comparator<Pessoa> {

	@Override // Ordenação personalizada da classe
	public int compare(Pessoa p1, Pessoa p2) {
		
		
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
	
}
