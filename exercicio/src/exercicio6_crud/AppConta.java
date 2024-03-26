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
                	consultaConta();        	
                	break;
                case 3:
                	alterarConta();
                	break;
                case 4:
                	excluirConta();
                	break;
                case 5: 
                	listarConta();
                	break;
                case 0: 
                	System.out.println("Programa encerrado!");
                	break;
                default:
                	System.out.println("Opção incorreta, tente novamente");
            }

        } while (opcao != 0);
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

        System.out.println("\n Cadastro de Conta Corrente \n");

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
            System.out.println("\n Cadastro efetuado \n");	
        }

    }
    public static void consultaConta() {
    	System.out.println("\nConsultar Conta\n");
    	if(qtdContas == 0) {
    		System.out.println("Vetor vazio");
    		return;
    	}
    	s.nextLine();
    	
    	System.out.println("Digite o ID da conta:");
    	int idConta = s.nextInt();
    	
    	int posicaoEncontrada = pesquisarContaCorrente(idConta);
    	
    	if (posicaoEncontrada == -1) {
    		System.out.println("\n Código não cadastrado \n");
    	}
    	
    	System.out.printf("\nID.................: %s ", cb[posicaoEncontrada].getIdConta());
    	System.out.printf("\nAgência............: %s ", cb[posicaoEncontrada].getAgencia());
    	System.out.printf("\nNúmero da conta....: %s ", cb[posicaoEncontrada].getNumeroConta());
    	System.out.printf("\nTipo de conta......: %s ", cb[posicaoEncontrada].getTipo());
    	System.out.printf("\nSaldo...............: R$ %s ", cb[posicaoEncontrada].getSaldo());
    	System.out.printf("\nLimite de Crédito...: R$ %s ", cb[posicaoEncontrada].getLimiteCredito());
    }
    
    public static void alterarConta() {
    	System.out.println("\n Alterar Conta \n");
    	
    	if(qtdContas == 0) {
    		System.out.println("Vetor vazio");
    		return;
    	}
    	
    	s.nextLine();
    	System.out.println("Digite o ID da conta que deseja alterar:");
    	int idConta = s.nextInt();
    	
    	int posicaoEncontrada = pesquisarContaCorrente(idConta);
    	
    	if (posicaoEncontrada == -1) {
    		System.out.println("\n Código não cadastrado \n");
    	}
    	s.nextLine();
    	
    	System.out.println("Nova agência: ");
    	String novaAgencia = s.nextLine();	
    	cb[posicaoEncontrada].setAgencia(novaAgencia);
    	System.out.println("Agência alterada!");
    	
    	
    	System.out.println("Novo tipo de conta: ");
    	String novoTipo = s.nextLine();
    	cb[posicaoEncontrada].setTipo(novoTipo);
    	System.out.println("Tipo de conta alterado!");   	
    }
    
    public static void excluirConta() {
    	System.out.println("\n Excluir Conta \n");
    	
    	if(qtdContas == 0) {
    		System.out.println("Vetor vazio");
    		return;
    	}
    	
    	s.nextLine();
    	System.out.println("Digite o ID da conta que deseja alterar:");
    	int idConta = s.nextInt();
    	
    	int posicaoEncontrada = pesquisarContaCorrente(idConta);
    	
    	if (posicaoEncontrada == -1) {
    		System.out.println("\n Código não cadastrado \n");
    	}
    	
    	System.out.printf("\nID.................: %s ", cb[posicaoEncontrada].getIdConta());
    	System.out.printf("\nAgência............: %s ", cb[posicaoEncontrada].getAgencia());
    	System.out.printf("\nNúmero da conta....: %s ", cb[posicaoEncontrada].getNumeroConta());
    	System.out.printf("\nTipo de conta......: %s ", cb[posicaoEncontrada].getTipo());
    	System.out.printf("\nSaldo...............: R$ %s ", cb[posicaoEncontrada].getSaldo());
    	System.out.printf("\nLimite de Crédito...: R$ %s ", cb[posicaoEncontrada].getLimiteCredito());
    	
    	s.nextLine();
    	
    	char confirma;
    	do {
    		System.out.println("\nConfirma a exclusçao da conta? [S/N]\n");
    		confirma = s.nextLine().charAt(0);
    		confirma = Character.toUpperCase(confirma);
    		if(confirma != 'S' && confirma != 'N') {
    			continue;
    		}
    		break;
    	}while(true);
    	
    	if(confirma == 'S') {
    		cb[posicaoEncontrada] = null;
    		
    		System.out.println("Conta excluída!");
    		
    		qtdContas --;
    	}
    	else {
    		System.out.println("Exclusão cancelada!");
    	}   	
    }
    
    public static void listarConta() {
    	System.out.println("\n Listagem de Contas \n");
    	
    	if(qtdContas == 0) {
    		System.out.println("Vetor vazio");
    		return;
    	}
    	
    	System.out.println("-----------------------------------------");
    	System.out.println("ID  Agência  Número  Tipo   Saldo  Limite");
    	System.out.println("-----------------------------------------");
    	
    	for(int i = 0; i < cb.length; i++) {
    		if(cb[i] != null) {
    			System.out.printf("%-6d %-11s %-10s %1s R$ %.2f  R$ %.2f\n",
    							   cb[i].getIdConta(),
    							   cb[i].getAgencia(),
    							   cb[i].getNumeroConta(),
    							   cb[i].getTipo(),
    							   cb[i].getSaldo(),
    							   cb[i].getLimiteCredito());
    		}
    	}
    	
    	System.out.println("-------------------------------------------------");
    	
    }
    
}
