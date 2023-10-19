package gustavo.collections.set.contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	// Atributos
	private Set<Contato> contatoSet;
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Gustavo", 12345678);
		agendaContatos.adicionarContato("Gustavo", 11614);
		agendaContatos.adicionarContato("Gustavo Pereira", 5617573);
		agendaContatos.adicionarContato("Gustavo Dev", 311345);
		agendaContatos.adicionarContato("Lucas Dev", 3717131);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisaPorNome("Gustavo"));
		
		System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Lucas Dev", 12));
		
		agendaContatos.exibirContatos();
	}
	
	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisaPorNome(String nome) {
		Set<Contato> contatoPorNome = new HashSet<>();
	
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatoPorNome.add(c);
			}
			
		}
		return contatoPorNome;
	
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		
		for(Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		
		return contatoAtualizado;
	}
}
