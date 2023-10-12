package gustavo.estudo.controledefluxo;

public class ForInArrays {
	public static void main(String[] args) {
		String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS", "GUSTAVO" };
		
		for(int i = 0; i < alunos.length; i ++) {
			System.out.println("O aluno no índice " + i + " é " + alunos[i]);
		}
	}
}
