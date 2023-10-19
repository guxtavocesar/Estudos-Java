
// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação
public enum EstadoBrasileiro {
	SAO_PAULO("SP", "São Paulo"),
	RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
	PIAUI("PI", "Piuaí"),
	MARANHAO("MA", "Maranhão");
	
	private String nome;
	private String sigla;
	
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}	
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
