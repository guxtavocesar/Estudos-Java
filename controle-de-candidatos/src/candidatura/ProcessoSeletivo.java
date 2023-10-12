package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class ProcessoSeletivo {
	
	public static ArrayList<String> candidatosSelecionados = new ArrayList<>();;
	
	public static void main(String[] args) {

		selecaoCandidatos();
		imprimirSelecionados();
		
		for(String candidato: candidatosSelecionados) {
			entrandoEmContato(candidato);
		}
		
		
	}
	
	// Esse método seleciona os candidatos com base na solicitacao de salario gerado de forma aleatória sobre um salario base, 
	// tudo isso tudo em uma lista de nomes pré determinada 
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE", "MARCIA", "PAULA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "GUSTAVO"};
	
		int candidatosSelecao = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecao < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido =  valorPretendido();
			
			System.out.println("O candidado " + candidato + " solicitou este valor de salario " + salarioPretendido );
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga\n");
				
				candidatosSelecionados.add(candidato);
				candidatosSelecao++;
				
			}
			candidatoAtual++;
		}
	}
	
	// Esse método efetua tentatias de ligação para os candidatos selecionados
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if(continuarTentando)
				tentativasRealizadas ++;
			else
				System.out.println("Contato realizado com sucesso!");
			
		} while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "° tentativa\n");
		else
			System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentavas realizadas\n");
	
	}
	
	// Método auxiliar ao método entrarEmContato()
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
	
	static void imprimirSelecionados() {
		System.out.println("Imprimindo a lista de candidatos informando o índice do elemento \n");
		
		for(int indice = 0; indice < candidatosSelecionados.size(); indice ++) {
			System.out.println("O candidato de N° " + (indice + 1) + " é " + candidatosSelecionados.get(indice) + "\n");
			
		}
		
	}
	
	// Método para gerar aleatóriamente o salário pretendido dos candidatos
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
}
