package gustavo.poo.fundamentos.msn;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("FacebookMessenger enviando mensagem!");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("FacebookMessenger enviando mensagem!");
		
	}

}
