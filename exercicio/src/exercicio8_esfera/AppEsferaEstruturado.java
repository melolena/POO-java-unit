package exercicio8_esfera;

import java.util.Scanner;

public class AppEsferaEstruturado {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio");
		double r = s.nextDouble();
		
		System.out.printf("\nÁrea  : %10.1f",  calcularArea(r));
		System.out.printf("\nVolume: %10.1f " , calcularVolume(r));

	}
	
	public static double calcularArea(double raio) {
		return 4 * Math.PI * Math.pow(raio, 2);  // o pow é utilizado para se fazer exponenciação
	}
	
	public static double calcularVolume(double raio) {
		double volume = 4/3 * Math.PI * Math.pow(raio, 3);
		
		return volume;
	}

}
