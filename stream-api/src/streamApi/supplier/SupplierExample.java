package streamApi.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T
 * É comumente usada para criar ou fornecer novos objetos de determinado tipo
 * */

public class SupplierExample {
	
	public static void main(String[] args) {
		
		Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)";
		
		List<String> listaSaudacao = Stream.generate(saudacao)
				.limit(5)
				.collect(Collectors.toList());
		
		// Imprimir as saudações geradas
		listaSaudacao.forEach(s -> System.out.println(s));
	}
} 
