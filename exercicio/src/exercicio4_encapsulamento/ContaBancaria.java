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


<<<<<<< HEAD
	
	void registraDeposito(double valor) {
		saldo += valor;
		System.out.printf("\n Depósito realizado no valor de: R$ %.2f. Saldo atual: R$ %.2f", valor, saldo);
	}
	
	boolean registraSaque(double valor) {
		if (tipo.equals("E")) {
	        if ((saldo - valor) >= -limiteCredito) {
	            saldo -= valor;
	            System.out.printf("\nSaque realizado no valor de R$ %.2f. Saldo atual: R$ %.2f", valor, saldo);
	            return true;
	        } 
	        else {
	            System.out.printf("\nSaldo insuficiente. Saldo atual: R$ %.2f", saldo);
	            return false;
	        }
	    } 
		else if (tipo.equals("N")) {
	        if ((saldo - valor) >= 0) {
	            saldo -= valor;
	            System.out.printf("\nSaque realizado no valor de R$ %.2f. Saldo atual: R$ %.2f", valor, saldo);
	            return true;
	        } 
	        else {
	            System.out.printf("\nSaldo insuficiente. Saldo atual: R$ %.2f", saldo);
	            return false;
	        }
	    }
		else {
	        System.out.println("Tipo de conta inválido.");
	        return false;
	    }
		
	}
=======
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void criarContaCorrente(int idConta, String agencia, String numeroConta, String tipo) {
        setIdConta(idConta);
        setAgencia(agencia);
        setNumeroConta(numeroConta);
        setTipo(tipo.toUpperCase());


        if (tipo.equals("E")) {
            limiteCredito = 2000;

        } else {
            limiteCredito = 0;
        }
    }

    public void mostrarDados() {
        System.out.println();
        System.out.println("Conta cadastrada com sucesso!");
        System.out.println("Id: " + getIdConta());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número de conta: " + getNumeroConta());
        System.out.println("Tipo de conta: " + getTipo());
        System.out.printf("Saldo: R$ %.2f", getSaldo());
        System.out.printf("\nLimite de crédito: R$ %.2f", getLimiteCredito());
    }
    
    public void registraDeposito(double valor) {
        saldo += valor;
        //System.out.printf("\nDepósito realizado no valor de: R$ %.2f. Saldo atual: R$ %.2f\n", valor, saldo);
    }

    public boolean registraSaque(double valor) {
        if (tipo.equals("E")) {
            if ((saldo - valor) >= -limiteCredito) {
                saldo -= valor;
                //System.out.printf("\nSaque realizado no valor de R$ %.2f. Saldo atual: R$ %.2f\n", valor, saldo);
                return true;
            } else {
                //System.out.printf("\nSaldo insuficiente. Saldo atual: R$ %.2f\n", saldo);
                return false;
            }
        } else if (tipo.equals("N")) {
            if ((saldo - valor) >= 0) {
                saldo -= valor;
                //System.out.printf("\nSaque realizado no valor de R$ %.2f. Saldo atual: R$ %.2f\n", valor, saldo);
                return true;
            } else {
                //System.out.printf("\nSaldo insuficiente. Saldo atual: R$ %.2f\n", saldo);
                return false;
            }
        } else {
            //System.out.println("Tipo de conta inválido.");
            return false;
        }
    }
>>>>>>> 0c1f70551a43dc6a03a79594509ad7054dcf1af9
}
