package gustavo.estudo.desafios;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	    
	    System.out.println("Digite o primeiro número: ");
	    int numero1 = scanner.nextInt();
	    
	    System.out.println("Digite o segundo número: ");
	    int numero2 = scanner.nextInt();
	    
	    scanner.close();
	    
	    try {
	        contar(numero1, numero2);
	    } catch (ParametrosInvalidosException e) {
	        System.out.println("Erro: " + e.getMessage());
	    }
	}

	static void contar(int firstParam, int secondParam) throws ParametrosInvalidosException {
	    if (firstParam > secondParam) {
	        throw new ParametrosInvalidosException(firstParam, secondParam);
	    } else {
	        int diferencaDosParametros = firstParam - secondParam;
	        
	        for (int i = 0; i <= Math.abs(diferencaDosParametros); i++) {
	            System.out.println("Imprimindo o número " + i);
	        }
	    }
	}
}