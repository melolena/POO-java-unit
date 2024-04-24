package exercicio8_esfera;

import java.util.Scanner;

public class AppEsferaPOO2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Raio: ");
		double raio = s.nextDouble();
		
		Esfera2 esfera = new Esfera2(raio);
		mostraDados(esfera);
	
		
		System.out.println("\n\nNovo valor de raio: ");
		double newRaio = s.nextDouble();
		
		esfera.setRaio(newRaio);
		mostraDados(esfera);
		

		s.close();
	}
	
	public static void mostraDados(Esfera2 e) {
		System.out.printf("\nRaio: %.1f", e.getRaio());
		System.out.printf("\nÁrea: %.1f", e.calcularAreaEsfera());
		System.out.printf("\nVolume: %.1f", e.calcularVolumeEsfera());
	}
}
