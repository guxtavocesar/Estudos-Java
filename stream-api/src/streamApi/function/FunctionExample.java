package streamApi.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos
 */

public class FunctionExample {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
		// Usar a Function com expressao lambda para dobras todos os números
		Function<Integer, Integer> dobrar = numero -> numero * 2;
		
		// Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
		List<Integer> numerosDobrados = numeros.stream()
				.map(n -> n * 2) // Utilizando o lambda
				.collect(Collectors.toList()); // Criando a lista com os números dobrados
	
		// Imprimir a lista de números dobrados
		numerosDobrados.forEach(n -> System.out.println(n));
		
		// Imprimir lista origial
		System.out.println(numeros);
	}

}