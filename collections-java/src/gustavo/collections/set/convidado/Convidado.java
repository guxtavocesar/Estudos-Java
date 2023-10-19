package gustavo.collections.set.convidado;

import java.util.Objects;

public class Convidado {
	// Atributos
	
	private String nome;
	private int codigoConvite;
	
	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
		
	}
	
	
	public int getCodigoConvite() {
		return codigoConvite;
	}
	
	// Verificação para não inserir elementos repetidos no conjunto
	
	@Override
	public int hashCode() {
		return Objects.hash(getCodigoConvite());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		
		if (getClass() != obj.getClass()) return false;
		
		Convidado other = (Convidado) obj;
		
		return getCodigoConvite() == other.getCodigoConvite();
	}
	
	// Fim da verificação para não inserir elementos repetidos no conjunto


	public String getNome() {
		return nome;
	}
	
	public void setCodigoConvite(int codigoConvite) {
		this.codigoConvite = codigoConvite;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome + "\n" +
			   "\nCódigo: " + codigoConvite + "\n";
	}
}
