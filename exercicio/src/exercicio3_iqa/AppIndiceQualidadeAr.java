package exercicio3_iqa;
import java.util.Scanner;

public class AppIndiceQualidadeAr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 IndiceQualidadeAr iqa = new IndiceQualidadeAr();
		 
		 //entrada
		
		System.out.println("Escreva o Índice de Qualidade do Ar (IQA): ");
		iqa.indice = s.nextDouble();
		
		System.out.println("Digite o Índice de Qualidade do Ar (IQA) anterior:");
		iqa.indiceAnterior = s.nextDouble();
		s.close();
		
		//chamando métodos
		
		iqa.defineClassificacao();
		iqa.defineEfeitos();
		iqa.compareIndice(iqa.indiceAnterior);
		
		System.out.println("Qualidade: " + iqa.classificacao);
		
		
		System.out.println("Efeito: "  + iqa.efeitos);
		
		System.out.println(iqa.diferenca(iqa.comparacao));
		
		// TODO Auto-generated method stub

	}

}
