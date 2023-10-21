package gustavo.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	
	public int somarDoisNumeros(int numero1, int numero2) {
		return numero1 + numero2;
		
	}
}
