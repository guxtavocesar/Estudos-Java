package gustavo.poo.fundamentos.msn;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("MSNMessenger enviando mensagem!");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("MSNMessenger recebendo mensagem!");
		
	}
	
	
}
