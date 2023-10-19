package lanchonete.area.cliente;

public class Cliente {
	public void escolherLanche() {
		System.out.println("ESCOLHENDO LANCHE");
	}
	
	public void fazerPedido() {
		System.out.println("FAZENDO O PEDIDO");
	}
	
	public void pagarConta() {
		consultarSaldoDoAplicativo();
		System.out.println("PAGANDO A CONTA");
	}
	
	private void consultarSaldoDoAplicativo() {
		System.out.println("CONSULTANDO SALDO NO APLICATIVO");
	}
}
