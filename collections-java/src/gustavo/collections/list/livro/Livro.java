package gustavo.collections.list.livro;

public class Livro {
	
	// Atributos
	private String livros;
	private String autor;
	private int anoPublicacao;
	
	public Livro(String livros, String autor, int anoPublicacao) {
		
		this.livros = livros;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getLivros() {
		return livros;
	}
	
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setLivros(String livros) {
		this.livros = livros;
	}
	
	@Override
	public String toString() {
		return "Livro: " + livros +
				" Autor: " + autor +
				" Publicacao: " + anoPublicacao;
	}
	
}
