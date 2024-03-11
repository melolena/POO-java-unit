package exercicio4_encapsulamento;

public class ContaBancaria {
	
	private int idConta;
	private String agencia, numeroConta, tipo;
	private double saldo = 0;
	private double limiteCredito = 0;
	
	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}


	
	void registraDeposito(double valor) {
		saldo += valor;
		System.out.printf("\n Depósito realizado no valor de: R$ %.2f", valor);
	}
	
	boolean registraSaque(double valor) {
		if (tipo.equals("E")) {
	        if ((saldo - valor) >= -limiteCredito) {
	            saldo -= valor;
	            System.out.printf("\nSaque realizado no valor de R$ %.2f. Saldo atual: R$ %.2f", valor, saldo);
	            return true;
	        } else {
	            System.out.printf("\nSaldo insuficiente. Saldo atual: R$ %.2f", saldo);
	            return false;
	        }
	    } else if (tipo.equals("N")) {
	        if ((saldo - valor) >= 0) {
	            saldo -= valor;
	            System.out.printf("\nSaque realizado no valor de R$ %.2f. Saldo atual: R$ %.2f", valor, saldo);
	            return true;
	        } else {
	            System.out.printf("\nSaldo insuficiente. Saldo atual: R$ %.2f", saldo);
	            return false;
	        }
	    } else {
	        System.out.println("Tipo de conta inválido.");
	        return false;
	    }
		
	}
}

	