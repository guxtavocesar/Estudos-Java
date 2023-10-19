package gustavo.poo.fundamentos.interfaces.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {

	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO SCANNER!");
	}

}
