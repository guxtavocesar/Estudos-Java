package gustavo.collections.list.livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> livroList;
	
	// Método principal
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		// Adicionando livros na lista
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
		catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
		catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
		catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 1994);
;		
		System.out.println(catalogoLivros.pesquisaPorAutor("Autor 4") + "\n");
		
		System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2022) + "\n");
	
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1") + "\n");
	}
	
	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	// Adicionando livros namlista
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	// Pesquisa na lista por Autor
	public List<Livro> pesquisaPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		
		return livrosPorAutor;	
	}
	
	// Pesquisa na lista por intervalo de ano
	public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAno = new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAno.add(l);
				}
			}
		}
		return livrosPorIntervaloAno;
		
	}
	
	// Pesquisando livros por titulo e retornando o primeiro resultado encontrado
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getLivros().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
			
		}
		return livroPorTitulo;
	}
	
}