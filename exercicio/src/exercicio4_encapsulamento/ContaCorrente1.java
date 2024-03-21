package exercicio4_encapsulamento;

public class ContaCorrente1 {

    public static void main(String[] args) {

        ContaBancaria cb = new ContaBancaria();      

        // 2.1
        cb.criarContaCorrente(0001, "Parnamirim", "00000004-2", "E");

        // 2.2
        cb.mostrarDados();

        System.out.println();

        // 2.3
        System.out.println("\nÁrea de depósito");
        cb.registraDeposito(1000);
        System.out.println("Saldo: R$ "+cb.getSaldo());
        cb.registraDeposito(500);
        System.out.println("Saldo: R$ "+cb.getSaldo());

        System.out.println();

        // 2.4
        System.out.println("\nÁrea de saque");
        if (!cb.registraSaque(1000)) {
        	System.out.println("Saldo insuficiente! Saldo atual: R$" +cb.getSaldo());
        }
        else {
        	System.out.println("Saldo: R$ "+ cb.getSaldo());
        }
        if (!cb.registraSaque(2000)) {
        	System.out.println("Saldo insuficiente! Saldo atual: R$" +cb.getSaldo());
        }
        else {
        	System.out.println("Saldo: R$ "+ cb.getSaldo());
        }
        if (!cb.registraSaque(800)) {
        	System.out.println("Saldo insuficiente! Saldo atual: R$" +cb.getSaldo());
        }
        else {
        	System.out.println("Saldo: R$ "+ cb.getSaldo());
        }
        
        System.out.println();

        

    }
}
