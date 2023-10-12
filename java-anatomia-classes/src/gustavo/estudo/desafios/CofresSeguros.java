package gustavo.estudo.desafios;

import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class CofresSeguros {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    int senhaLogin;
    int senhaEntrada;
    String cofreValidado;
    boolean senhaValidada;
    
    // TODO: Implemente a condição necessário para a verificação dos cofresa seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      
      senhaLogin = scanner.nextInt();
      senhaEntrada = scanner.nextInt();
      
      CofreDigital cofreDigital = new CofreDigital(senhaLogin);
      senhaValidada = cofreDigital.validarSenha(senhaEntrada);
      
      cofreValidado = senhaValidada ? "Cofre aberto!" : "Senha incorreta!";
      
      System.out.println("Tipo: Cofre Digital");
      System.out.println("Metodo de abertura: Senha");
      System.out.println(cofreValidado);
      
    } else {
      CofreFisico cofreFisico = new CofreFisico();
      System.out.println("Tipo: Cofre Fisico");
      System.out.println("Metodo de abertura: Chave");
      
    }
  }
}