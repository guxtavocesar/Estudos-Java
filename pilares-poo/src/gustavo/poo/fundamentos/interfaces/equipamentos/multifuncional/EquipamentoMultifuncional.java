package gustavo.poo.fundamentos.interfaces.equipamentos.multifuncional;

import gustavo.poo.fundamentos.interfaces.equipamentos.copiadora.Copiadora;
import gustavo.poo.fundamentos.interfaces.equipamentos.digitalizadora.Digitalizadora;
import gustavo.poo.fundamentos.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO MULTIFUNCIONAL");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO MULTIFUNCIONAL");
		
	}

	@Override
	public void copiar() {
		System.out.println("COPIANDO MULTIFUNCIONAL");
		
	}

}
