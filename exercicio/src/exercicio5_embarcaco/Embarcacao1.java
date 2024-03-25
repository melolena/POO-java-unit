package exercicio5_embarcaco;

public class Embarcacao1 {

	public static void main(String[] args) {
Embarcacao embarcacao = new Embarcacao("785", 70);
		
		System.out.printf("\nCódigo...............: %s", embarcacao.getCodigo());
		System.out.printf("\nSituacao.............: %s", embarcacao.getSituacao());
		System.out.printf("\nCapacidade...........: %d", embarcacao.getCapacidade());
		System.out.printf("\nPessoas transportadas: %d", embarcacao.getPessoasTransportadas());
		
		embarcacao.registraEmbarque(20);
		System.out.println("\n\n*******************");
		System.out.println("Embarque de 20 pessoas");
		System.out.printf("\nSituacao.............: %s", embarcacao.getSituacao());
		System.out.printf("\nPessoas transportadas: %d", embarcacao.getPessoasTransportadas());
		
		
		embarcacao.registraEmbarque(5);
		System.out.println("\n\n*******************");
		System.out.println("Embarque de 5 pessoas");
		System.out.printf("\nSituacao.............: %s", embarcacao.getSituacao());
		System.out.printf("\nPessoas transportadas: %d", embarcacao.getPessoasTransportadas());
		
		embarcacao.registraEmbarque(50);
		System.out.println("\n\n*******************");
		System.out.println("Embarque de 50 pessoas");
		System.out.printf("\nSituacao.............: %s", embarcacao.getSituacao());
		System.out.printf("\nPessoas transportadas: %d", embarcacao.getPessoasTransportadas());
		
		embarcacao.registraDesembarque(3);
		System.out.println("\n\n*******************");
		System.out.println("Desembarque de 3 pessoas");
		System.out.printf("\nSituacao.............: %s", embarcacao.getSituacao());
		System.out.printf("\nPessoas transportadas: %d", embarcacao.getPessoasTransportadas());
		
		embarcacao.registraDesembarque(2);
		System.out.println("\n\n*******************");
		System.out.println("Desembarque de 2 pessoas");
		System.out.printf("\nSituacao.............: %s", embarcacao.getSituacao());
		System.out.printf("\nPessoas transportadas: %d", embarcacao.getPessoasTransportadas());

		embarcacao.registraDesembarque(1);
		System.out.println("\n\n*******************");
		System.out.println("Desembarque de 1 pessoas");
		System.out.printf("\nSituacao.............: %s", embarcacao.getSituacao());
		System.out.printf("\nPessoas transportadas: %d", embarcacao.getPessoasTransportadas());
		
		embarcacao.setCapacidade(75);
		System.out.println("\n\n*******************");
		System.out.println("Capacidade alterada para 75 pessoas");
		System.out.printf("\nNova capacidade......: %d", embarcacao.getCapacidade());

		embarcacao.registraEmbarque(6);;
		System.out.println("\n\n*******************");
		System.out.println("Embarque de 6 pessoas");
		System.out.printf("\nSituacao.............: %s", embarcacao.getSituacao());
		System.out.printf("\nPessoas transportadas: %d", embarcacao.getPessoasTransportadas());

	}

}
