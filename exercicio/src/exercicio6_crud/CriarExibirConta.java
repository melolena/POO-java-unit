package exercicio6_crud;


public class CriarExibirConta {
	 void criarContaCorrente(ContaBancaria cb, int idConta, String agencia, String numeroConta, String tipo, double saldo, double limiteCredito) {
	        cb.setIdConta(idConta);
	        cb.setAgencia(agencia);
	        cb.setNumeroConta(numeroConta);
	        cb.setTipo(tipo);
	        cb.setSaldo(saldo);
	        cb.setLimiteCredito(limiteCredito);
	    }

	    void mostrarDados(ContaBancaria cb) {
	    	System.out.println();
	    	System.out.println("Conta cadastrada com sucesso!");
	        System.out.println("Id: " + cb.getIdConta());
	        System.out.println("Agência: " + cb.getAgencia());
	        System.out.println("Número de conta: " + cb.getNumeroConta());
	        System.out.println("Tipo de conta: " + cb.getTipo());
	        System.out.printf("Saldo: R$ %.2f" , cb.getSaldo());
	        System.out.printf("\n Limite de crédito: R$ %.2f", cb.getLimiteCredito());
	    }
}
