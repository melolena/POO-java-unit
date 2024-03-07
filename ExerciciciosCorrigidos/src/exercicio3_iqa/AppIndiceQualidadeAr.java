package exercicio3_iqa;
import java.util.Scanner;
public class AppIndiceQualidadeAr {

	public static void main(String[] args) {
		
		//2.1
		IndiceQualidadeAr iqa= new IndiceQualidadeAr();
		Scanner s = new Scanner(System.in);
		
		//2.2
		System.out.println("Digite o índice");
		double indice = s.nextDouble();
		iqa.setIndice(indice);
		
		//2.3
		iqa.defineClassificacao();
		iqa.defineEfeitos();
		
		//2.4
		System.out.println(iqa.getIndice());
		System.out.println(iqa.getClassificacao());
		System.out.println(iqa.getEfeitos());
		
		//2.5
		System.out.println("Digite o Índice de Qualidade do Ar (IQA) anterior:");
		double indiceAnterior = s.nextDouble();
		
		double diferenca = iqa.comparaIndice(indiceAnterior);
		
		System.out.println(diferenca);
		
		//2.6
		
		if(diferenca > 0) {
			System.out.println("A qualidade do ar piorou");
		}
		 else if(diferenca < 0) {
			System.out.println( "A qualidade do ar melhorou");
		}
		else {
			System.out.println("A qualidade do ar se mantém estável");
		}
		
		

	}

}
