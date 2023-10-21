package gustavo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Beans - Objetos gerenciados pelo Spring
// Injecao de dependencias

@Component
public class MyApp implements CommandLineRunner{
	@Autowired
	private Calculadora calculadora;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("O resultado é: " + calculadora.somarDoisNumeros(505, 158));
		
	}

	
	
	
}
