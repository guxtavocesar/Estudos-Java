package lanchonete.atendimento.cozinha;

public class Cozinheiro {

	// Pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUES NO BALCAO");
	}
	
	// Pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCAO");
	}
	
	// Pode ser default
	public void adicionarComboNoBalcao() {
		System.out.println("ADICIONANDO COMBO NO BALCAO");
	}
	
	// Pode ser default
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
	}
	
	private void prepararVitamina() {
		System.out.println("PREPARANDO VITAMINA");
	}
	
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}
	
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}
	
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
	}
	
	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO CARNE E OVO PARA O HAMBURGER");
	}
	
	private void pediarParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
	
	
	
}
