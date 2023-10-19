package gustavo.collections.set.contato;

import java.util.Objects;

public class Contato {
	
	// Atributos
	private String nome;
	private int numero;
	
	public Contato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(getNome());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Contato))
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(getNome(), other.getNome());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nNome: " + nome +
			   "\nNumero: " + numero + "\n";
	}

}
