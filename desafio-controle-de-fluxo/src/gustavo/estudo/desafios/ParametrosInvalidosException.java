package gustavo.estudo.desafios;

public class ParametrosInvalidosException extends Exception {
    
    public ParametrosInvalidosException(int numero1, int numero2) {
    	
    	super("O segundo parametro deve ser maior que o primeiro: " + numero1 + " e " + numero2);   	

    }
}
