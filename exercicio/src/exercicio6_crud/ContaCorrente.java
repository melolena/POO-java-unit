package exercicio6_crud;



public class ContaCorrente {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria(2344, "Boa Viagem", "22348-0", "E");
		
		//2.1

    	System.out.printf("\nID.................: %s ", cb.getIdConta());
    	System.out.printf("\nAgência............: %s ", cb.getAgencia());
    	System.out.printf("\nNúmero da conta....: %s ", cb.getNumeroConta());
    	System.out.printf("\nTipo de conta......: %s ", cb.getTipo());
    	System.out.printf("\nSaldo...............: R$ %s ", cb.getSaldo());
    	System.out.printf("\nLimite de Crédito...: R$ %s ", cb.getLimiteCredito());
		
		
		//2.2
		
		
		System.out.println();
		
		//2.3
		System.out.print("\n Área de depósito");
		cb.registraDeposito(1000);
		cb.registraDeposito(500);
		
		System.out.println();
		
		//2.4 
		System.out.print("\n Área de saque");
		cb.registraSaque(1000);
		cb.registraSaque(2000);
		cb.registraSaque(800);
		
		System.out.println();

	}

}
