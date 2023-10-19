package gustavo.poo.fundamentos.conceitos;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		
		jeep.setChassi("959848");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("161646");
		z400.ligar();
		
		Veiculo coringa = jeep;
		coringa.ligar();
		
		Veiculo coringa2 = z400;
		coringa2.ligar();
	}
}
