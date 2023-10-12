package gustavo.estudo.javasintaxe;

import java.util.Locale;
import java.util.Scanner;

public class MyClass {
	
	/* Main class method */
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = scanner.next();
		
		System.out.println("Digite sua altura: ");
		double altura = scanner.nextDouble();

		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Olá, me chamo " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " anos");
		System.out.println("Minha altura é " + altura + "cm ");
		
		/* Variables declaration examples */
		String firstName = "Gustavo";
		String secondName = "César";
		
		/*Methods/Functions declaration and call examples*/
		String completeName = completeName(firstName, secondName);
		
		System.out.println(completeName);

			
	}
	
	/*Methods/Functions structure*/
	public static String completeName(String firstName, String secondName) {
		return firstName.concat(" ").concat(secondName);
	}
}