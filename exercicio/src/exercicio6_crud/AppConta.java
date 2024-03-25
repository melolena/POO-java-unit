package exercicio6_crud;
import java.util.Scanner;

public class AppConta {

    static Scanner s = new Scanner(System.in);
    static ContaBancaria cb[] = new ContaBancaria[3];
    static int qtdContas = 0;

    public static void main(String[] args) {
        int opcao = 0;

        do {

            System.out.println("Menu");
            System.out.println("1 - Cadastrar uma nova conta");
            System.out.println("2 - Consultar conta");
            System.out.println("3 - Editar conta");
            System.out.println("4 - Excluir conta");
            System.out.println("5 - Listar Contas");
            System.out.println("0 - sair");

            System.out.println("Escolha uma opção: ");

            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    criarContaCorrente();
                    break;
                case 2: 
                	
                	System.out.println("Digite ID da conta a ser consultado: ");
                	int idConsultar = s.nextInt();
                	pesquisarContaCorrente(idConsultar);
                	
                	break;
            }

        } while (opcao != 0);
        System.out.println("Você finalizou o programa!");
        s.close();
    }
    
    public static int pesquisarContaCorrente(int idConta) {
    	for(int i = 0; i < cb.length; i++) {
    		if(cb[i] != null && idConta == cb[i].getIdConta()) {
    			return i; 
    		}
    	}
    	
    	return -1;
    	
    }

    public static void criarContaCorrente() {

        System.out.println("Cadastro de Conta Corrente");

        if (qtdContas == cb.length) {
            System.out.println("Vetor cheio");
            return;
        } else {
        	
        	System.out.println("Digite o ID da Conta: ");
            
        	int idConta = s.nextInt();
            
        	if(pesquisarContaCorrente(idConta) != -1) {
            	System.out.println("ID já cadastrado");
            	return;
            }
        	s.nextLine();
        	
        	System.out.println("Digite o nome da agência: \n");
        	
        	String agencia = s.nextLine();
        	
        	System.out.println("Digite o número da conta: \n");
        	
        	String numeroConta = s.nextLine();
        	
        	System.out.println("Digite o tipo da conta: \n");           

            String tipo = s.nextLine();
            
            
            cb[qtdContas] = new ContaBancaria(idConta, agencia, numeroConta, tipo);
            qtdContas ++;
            System.out.println("\n-- Cadastro efetuado --\n");	
        }

    }
}
