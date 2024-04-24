package exercicio8_esfera;
import java.util.Scanner;

public class AppEsferaPO1 {
	static Esfera1 esfera;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Raio: ");
		double raio = s.nextDouble();
		
		esfera = new Esfera1(raio);
		mostraDados();
	
		
		System.out.println("\n\nNovo valor de raio: ");
		double newRaio = s.nextDouble();
		
		esfera.AlteraRaio(newRaio);
		mostraDados();
		

		s.close();
	}
	
	public static void mostraDados() {
		System.out.printf("\nRaio: %.1f", esfera.getRaio());
		System.out.printf("\nÁrea: %.1f", esfera.getArea());
		System.out.printf("\nVolume: %.1f", esfera.getVolume());
	}

}
