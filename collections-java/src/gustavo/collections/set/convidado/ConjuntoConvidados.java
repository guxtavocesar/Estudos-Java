package gustavo.collections.set.convidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	// Atributo
	private Set<Convidado> convidadoSet;
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");
		
		conjuntoConvidados.adicionarConvidadoNoSet("Enviados 1", 64657);
		conjuntoConvidados.adicionarConvidadoNoSet("Enviados 2", 6464);
		conjuntoConvidados.adicionarConvidadoNoSet("Enviados 3", 6464);
		conjuntoConvidados.adicionarConvidadoNoSet("Enviados 4", 1325);
	
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");
		conjuntoConvidados.removerConvidadoCodigoConvite(6464);
		
		conjuntoConvidados.exibirConvidados();
	}
	
	// O hash representa um conjunto sem repetições
	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidadoNoSet(String nome, int codigo) {
		convidadoSet.add(new Convidado(nome, codigo));
	}
	
	public void removerConvidadoCodigoConvite(int codigo) {
		 Convidado convidadoParaRemover = null;
		 
		 for(Convidado c : convidadoSet) {
			 if(c.getCodigoConvite() == codigo) {
				 convidadoParaRemover = c;
				 break;
			 }
		 }
		 
		 convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	
}
