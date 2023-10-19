package gustavo.collections.list.pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	
	// Atributos
	private List<Pessoa> pessoaList;
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		
		ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
		ordenacaoPessoa.adicionarPessoa("Nome 2", 25, 1.78);
		ordenacaoPessoa.adicionarPessoa("Nome 3", 12, 1.30);
		ordenacaoPessoa.adicionarPessoa("Nome 4", 68, 1.70);
		ordenacaoPessoa.adicionarPessoa("Nome 5", 56, 1.89);
		
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
	}
	
	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorIdade);
		
		return pessoaPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		
		return pessoaPorAltura;
	}
}
