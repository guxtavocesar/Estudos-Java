package gustavo.poo.fundamentos.msn;

public class Telegram extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Telegram enviando mensagem!");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Telegram enviando mensagem!");
		
	}

}
