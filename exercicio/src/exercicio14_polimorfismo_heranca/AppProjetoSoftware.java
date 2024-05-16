package exercicio14_polimorfismo_heranca;

public class AppProjetoSoftware {

	public static void main(String[] args) {
		
		//2.1
		Personagem personagem = new Personagem("Loki", 50);
		
		
		System.out.println("Id: " + personagem.getId());
		System.out.println("Nome: " + personagem.getNome());
		System.out.println("Pontos: " + personagem.getPontos());
		
		System.out.println();
		//2.2
		personagem.recebeGolpe(2);
		
		System.out.println(personagem.getPontos());
		
		//2.3
		personagem.recebeGolpe('m', 3);
		
		System.out.println(personagem.getPontos());
		
		//2.4
		personagem.recebeGolpe('M', 2);
		
		System.out.println(personagem.getPontos());
		
		
		//2,.5
		
		personagem.recebeGolpe('E', 1);
		
		System.out.println(personagem.getPontos());

	}

}
