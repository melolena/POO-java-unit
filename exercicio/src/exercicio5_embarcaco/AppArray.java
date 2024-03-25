package exercicio5_embarcaco;
import java.util.Scanner;

public class AppArray {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		int num[] = new int[4];
		
		int acum = 0;
		
		for (int j = 0; j < num.length; j++) {
			System.out.printf("%dº número: ", (j+1));
			num[j] = input.nextInt();
			acum += num[j];
		}
		int media = acum/num.length;

		System.out.printf("\nMédia: %d\n", media);

		int cont =0;
		for (int j = 0; j < num.length; j++) {
			if (num[j] > media) {
				cont++;
			}
		}
				
		System.out.printf("\nNúmeros acima da média: %d", cont);
		
	
		for (int i = 0; i < num.length; i++) {
			System.out.printf("\nValor do %dº elemento: %d\n", (i+1), num[i]);
		}

		
		input.close();
	}

}
