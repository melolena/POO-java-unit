package exercicio2;
import java.util.Scanner;
public class AppMassaCorporea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declarando e instanciando um objeto da classe MassaCorporea
		MassaCorporea mc = new MassaCorporea();
		
		// Recebendo dados do teclado e armazenando em atributos no objeto mc
		System.out.println("Peso..:");
		mc.peso = input.nextDouble();
		System.out.println("Altura:");
		mc.altura = input.nextDouble();
		// Chamando métodos do objeto mc
		mc.calcularImc();
		mc.definirSituacao();
		 // Exibindo atributos do objeto mc
		System.out.printf("\nIMC.....: %.1f", mc.imc);
		System.out.printf("\nSituação: %s", mc.situacao);
		input.close();// TODO Auto-generated method stub

	}

}
