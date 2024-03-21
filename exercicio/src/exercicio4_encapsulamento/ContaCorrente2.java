package exercicio4_encapsulamento;

public class ContaCorrente2 {

	public static void main(String[] args) {
		
			ContaBancaria cb = new ContaBancaria();

			// 3.1
			cb.criarContaCorrente(0002, "Aflitos", "00000005-7", "N");
			
			// 3.2
			cb.mostrarDados();
			
			System.out.println();
			
			// 3.2
			System.out.println("\nÁrea de depósito");
			cb.registraDeposito(1000);
			System.out.println("Saldo: R$ "+cb.getSaldo());
			cb.registraDeposito(2000);
			System.out.println("Saldo: R$ "+cb.getSaldo());
			
			System.out.println();
			
			// 3.3
			System.out.println("\nÁrea de saque");
			if (!cb.registraSaque(2000)) {
			    System.out.println("Saldo insuficiente ou valor acima do limite de crédito! Saldo atual: R$" + cb.getSaldo());
			} else {
			    System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + cb.getSaldo());
			}
			
			if (!cb.registraSaque(3000)) {
			    System.out.println("Saldo insuficiente ou valor acima do limite de crédito! Saldo atual: R$" + cb.getSaldo());
			} else {
			    System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + cb.getSaldo());
			}	
	}

}
