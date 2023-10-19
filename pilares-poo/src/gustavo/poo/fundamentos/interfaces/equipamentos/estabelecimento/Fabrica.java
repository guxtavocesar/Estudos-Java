package gustavo.poo.fundamentos.interfaces.equipamentos.estabelecimento;

import gustavo.poo.fundamentos.interfaces.equipamentos.impressora.Deskjet;
import gustavo.poo.fundamentos.interfaces.equipamentos.impressora.Impressora;
import gustavo.poo.fundamentos.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;
import gustavo.poo.fundamentos.interfaces.equipamentos.digitalizadora.Digitalizadora;

public class Fabrica {
	public static void main(String[] args) {
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = new Deskjet();
		Digitalizadora digitalizadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
	}
}
