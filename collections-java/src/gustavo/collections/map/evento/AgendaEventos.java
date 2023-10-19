package gustavo.collections.map.evento;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> eventoMap;
	
	public AgendaEventos() {
		this.eventoMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventoMap.put(data, evento);
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap); // LocalDate já sabe organizar as data em ordem crecente pois ele ja implementa um comparable
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
//		Set<LocalDate> dataSet = eventoMap.keySet();
//		Collection<Evento> values = eventoMap.values();
		
//		eventoMap.get();
		
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap); // LocalDate já sabe organizar as data em ordem crecente pois ele ja implementa um comparable

		for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("\nO próximo evento: " + entry.getValue() + "\nacontecerá na data " + entry.getKey());
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 25), "Evento 3", "Atracao 9");
		agendaEventos.adicionarEvento(LocalDate.of(2021, 5, 7), "Evento 50", "Atracao 47");
		agendaEventos.adicionarEvento(LocalDate.of(2023, 11, 15), "Evento 1", "Atracao 101");
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
		
	}
}
