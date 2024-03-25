package exercicio6_crud;



public class ContaCorrente {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria();
		CriarExibirConta ce = new CriarExibirConta();
		
		//2.1
		
		ce.criarContaCorrente(cb, 0001, "Parnamirim", "00000004-2", "E", 0, 2000);
		
		//2.2
		ce.mostrarDados(cb);
		
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
		
		//3.1
		
		ce.criarContaCorrente(cb, 0002, "Aflitos", "00000005-7", "N", 0, 0);
		
		//3.2
		
	
		ce.mostrarDados(cb);
		
		System.out.println();
		
		//3.2
		System.out.println("\n Área de depósito");
		cb.registraDeposito(1000);
		cb.registraDeposito(2000);
		
		System.out.println();
		
		//3.3
		System.out.println("\n Área de saque");
		cb.registraSaque(2000);
		cb.registraSaque(3000);
		

	}

}
