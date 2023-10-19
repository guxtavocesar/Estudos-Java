package gustavo.collections.map.evento;

public class Evento {

	// Atributos
	private String nome;
	private String atracao;
	
	public Evento(String nome, String atracao) {
		this.nome = nome;
		this.atracao = atracao;
	}

	public String getNome() {
		return nome;
	}

	public String getAtracao() {
		return atracao;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\n" +
			   "\nAtracao: " + atracao + "\n";
	}
	
	
}
