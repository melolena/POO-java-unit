package exercicio4_encapsulamento;

public class ContaCorrente {

	public static void main(String[] args) {
		
		ContaBancaria cb = new ContaBancaria();
		
		//2.1
		
		cb.setIdConta(0001);
		cb.setAgencia("Derby");
		cb.setNumeroConta("00000004-1");
		cb.setTipo("E");
		cb.setSaldo(0);
		cb.setLimiteCredito(2000);;
		
		//2.2
		
				
		System.out.println("Conta cadastrada com sucesso!");
		System.out.println("Id: " +cb.getIdConta());
		System.out.println("Agência: " +cb.getAgencia());
		System.out.println("Número de conta: " +cb.getNumeroConta());
		System.out.println("Tipo de conta: " + cb.getTipo());
		System.out.printf("Saldo: R$ %.2f" , cb.getSaldo());
		System.out.printf("\n Limite de crédito: R$ %.2f", cb.getLimiteCredito());
		
		
		//2.3
		System.out.print("\n Área de depósito");
		cb.registraDeposito(1000);
		cb.registraDeposito(500);
		
		//2.4 
		System.out.print("\n Área de saque");
		cb.registraSaque(1000);
		cb.registraSaque(2000);
		cb.registraSaque(800);
		
		System.out.println();
		
		//3.1
		cb.setIdConta(0002);
		cb.setAgencia("Aflitos");
		cb.setNumeroConta("00000005-7");
		cb.setTipo("N");
		cb.setSaldo(0);
		cb.setLimiteCredito(0);
		
		//3.2
		System.out.println("\n Conta cadastrada com sucesso!");
		System.out.println("Id: " +cb.getIdConta());
		System.out.println("Agência: " +cb.getAgencia());
		System.out.println("Número de conta: " +cb.getNumeroConta());
		System.out.println("Tipo de conta: " + cb.getTipo());
		System.out.printf("Saldo: R$ %.2f" , cb.getSaldo());
		System.out.printf("\n Limite de crédito: R$ %.2f", cb.getLimiteCredito());
		
		//3.2
		System.out.println("\n Área de depósito");
		cb.registraDeposito(1000);
		cb.registraDeposito(2000);
		
		//3.3
		System.out.println("\n Área de saque");
		cb.registraSaque(2000);
		cb.registraSaque(3000);
	

	}

}
