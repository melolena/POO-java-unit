package exercicio9_jogo;

public class AppJogo {

	public static void main(String[] args) {
		Personagem persona1 = new Personagem("José", 4);
		mostrarPersonagem(persona1);
		
		Personagem persona2 = new Personagem("Maria", 5);
		mostrarPersonagem(persona2);
		
		for(int i=0; i<=6; i++) {
			System.out.println("--------------------------");
			System.out.println("\nRealizando ataque nº" + (i+1));
			if(persona1.getVida()==0) {
				System.out.println("O Personagem está morto");
			}
			else {
				System.out.println("Experiência: " +persona1.realizaAtaque());
				System.out.println("Nível       : " +persona1.getNivel());
			}
		}
		
		
		
		for(int i=0; i<=6; i++) {
			if(persona1.getVida() ==0) {
				System.out.println("O personagem está morto!");
			}
			else {
				if(persona1.ReceberAtaque(40) == false) {
					System.out.println("O ataque não teve impacto");
				}
			}
			
			mostrarPersonagem(persona1);
		}

	}
	
	public static void mostrarPersonagem(Personagem persona) {
		System.out.println("=======================");
		System.out.println("Id              :" + persona.getId());
		System.out.println("Nome            :" + persona.getNome());
		System.out.println("Nível           :" +persona.getNivel());
		System.out.println("Vida            :" + persona.getVida());
		System.out.println("Experiência     :" + persona.getExperiencia());
		
	}

}
