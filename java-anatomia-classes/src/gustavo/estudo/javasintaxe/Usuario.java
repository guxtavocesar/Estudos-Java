package gustavo.estudo.javasintaxe;

public class Usuario {
	public static void main(String[] args) {
		
		Metodos metodos = new Metodos();
		
		metodos.mudarCanal(13);
		System.out.println("Canal Atual? " + metodos.canal);
		
		metodos.diminuirVolume();
		metodos.diminuirVolume();
		metodos.diminuirVolume();
		metodos.aumentarVolume();
		
		System.out.println("TV ligada? " + metodos.ligada);
		System.out.println("Canal Atual? " + metodos.canal);
		System.out.println("Volume Atual? " + metodos.volume);
		
		metodos.ligar();
		System.out.println("Novo status - TV ligada? " + metodos.ligada);
		
		metodos.desligar();
		System.out.println("Novo status - TV ligada? " + metodos.ligada);
		
		 


	}
}
