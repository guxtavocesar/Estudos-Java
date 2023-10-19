
public class SistemaDeCadastro {
	public static void main(String[] args) {
		
		//Criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("50155054856", "Marcos");
		
		// Definimos o endereco de Marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		System.out.println(marcos.getNome() + " - " +marcos.getCpf());
		
	}
}
