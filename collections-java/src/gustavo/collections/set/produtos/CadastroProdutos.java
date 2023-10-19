package gustavo.collections.set.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	
	// Atributos
	private Set<Produto> produtoSet;
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(1, "Refrigerante", 15.25, 10);
		cadastroProdutos.adicionarProduto(2, "Geladeira", 65.58, 15);
		cadastroProdutos.adicionarProduto(3, "Computador", 851.54, 201);
		cadastroProdutos.adicionarProduto(4, "Toalha", 150.05, 302);
		
		System.out.println(cadastroProdutos.produtoSet);
		
		System.out.println(cadastroProdutos.exibirProdutoPorNome());
		
		System.out.println(cadastroProdutos.exibirPorPreco());
		
	}

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(codigo, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutoPorNome(){ // TreeSet consegue organizar a lista pela ordem natural da lista
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
		return produtoPorNome;
		
	}
	
	public Set<Produto> exibirPorPreco() {
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtoSet); // Atualizando lista
		
		return produtoPorPreco;
		
	}
	
	
}
