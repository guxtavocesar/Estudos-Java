package gustavo.collections.map.contato;

import java.util.HashMap;
import java.util.Map;

public class Contatos {
	
	// Atributos
	private Map<String, Integer> agendaContatoMap;
	
	public Contatos() {
		this.agendaContatoMap = new HashMap<>();
		
	}
	
	
	public static void main(String[] args) {
		Contatos agendaContatos = new Contatos();
		
		agendaContatos.adicionarContato("Gustavo", 123456);
		agendaContatos.adicionarContato("Gustavo César", 5665);
		agendaContatos.adicionarContato("Gustavo Luzi", 111111);
		agendaContatos.adicionarContato("Gustavo Pereira ", 611);
		agendaContatos.adicionarContato("Gustavo Dev", 3135);
		
		agendaContatos.exibirContato();
		
		agendaContatos.removerContato("Gustavo César");
		agendaContatos.exibirContato();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContato() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		
		return numeroPorNome;
	} 
	
}
