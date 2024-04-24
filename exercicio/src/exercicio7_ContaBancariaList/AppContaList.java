package exercicio7_ContaBancariaList;

import java.util.ArrayList;
import java.util.Scanner;
import exercicio6_crud.ContaBancaria;


public class AppContaList {
    static ArrayList<ContaBancaria> contas = new ArrayList();
    static Scanner s = new Scanner(System.in);

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
                   criarConta();
                    break;
                case 2:
                   consultarConta();
                    break;
                case 3:
                   alterarConta();
                    break;
                case 4:
                   excluirConta();
                    break;
                case 5:
                   listarContas();
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

    public static ContaBancaria pesquisarContaCodigo(int idConta) {
    	for(ContaBancaria cb: contas) {
    		if(cb != null && idConta == cb.getIdConta()) {
    			return cb;
    		}
    	}
    	return null;
    }
    public static void criarConta() {
    	
    	System.out.println("\nCadastro de Conta Corrente\n");
    	
    	System.out.println("Digite o ID da Conta: ");
    	int idConta = s.nextInt();
    	
    	if(pesquisarContaCodigo(idConta) != null) {
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
                
        System.out.println("Digite o limite de crédito: \n");
        
        double limiteCredito = s.nextDouble();
        
        ContaBancaria conta = new ContaBancaria(idConta, agencia, numeroConta, tipo, limiteCredito);
        contas.add(conta);
        
        System.out.println("\nCadastro efetuado\n");
    }
    
    public static void consultarConta() {
    	if(contas.size() == 0) {
    		System.out.println("Lista vazia");
    	}
    	
    	s.nextLine();
    	
    	System.out.println("Digite o ID da conta:");
    	int idConta = s.nextInt();
    	
    	ContaBancaria contaEncontrada = pesquisarContaCodigo(idConta);
    	
    	if (contaEncontrada == null) {
    		System.out.println("\nCódigo não cadastrado\n");
    		return;
    	}
    	
    	System.out.printf("\nID.................: %s ", contaEncontrada.getIdConta());
    	System.out.printf("\nAgência............: %s ", contaEncontrada.getAgencia());
    	System.out.printf("\nNúmero da conta....: %s ", contaEncontrada.getNumeroConta());
    	System.out.printf("\nTipo de conta......: %s ", contaEncontrada.getTipo());
    	System.out.printf("\nSaldo...............: R$ %s ", contaEncontrada.getSaldo());
    	System.out.printf("\nLimite de Crédito...: R$ %s ", contaEncontrada.getLimiteCredito());
    }
    
    public static void alterarConta() {
    	System.out.println("\nAlterar Conta\n");
    	
    	if(contas.size() == 0) {
    		System.out.println("Lista vazia");
    	}
    	
    	System.out.println("Digite o ID da conta:");
    	int idConta = s.nextInt();
    	
    	ContaBancaria contaEncontrada = pesquisarContaCodigo(idConta);
    	
    	if (contaEncontrada == null) {
    		System.out.println("\nCódigo não cadastrado\n");
    		return;
    	}
    	
    	s.nextLine();
    	
    	System.out.printf("\nID.................: %s ", contaEncontrada.getIdConta());
    	System.out.printf("\nAgência............: %s ", contaEncontrada.getAgencia());
    	System.out.printf("\nNúmero da conta....: %s ", contaEncontrada.getNumeroConta());
    	System.out.printf("\nTipo de conta......: %s ", contaEncontrada.getTipo());
    	System.out.printf("\nSaldo...............: R$ %s ", contaEncontrada.getSaldo());
    	System.out.printf("\nLimite de Crédito...: R$ %s ", contaEncontrada.getLimiteCredito());
    	
    	System.out.println("\n\nNova agência: ");
    	String novaAgencia = s.nextLine();	
    	contaEncontrada.setAgencia(novaAgencia);
    	System.out.println("Agência alterada!");
    	
    	
    	System.out.println("Novo tipo de conta: ");
    	String novoTipo = s.nextLine();
    	contaEncontrada.setTipo(novoTipo);
    	System.out.println("Tipo de conta alterado!");
    	
    	
    	System.out.println("Novo limite de conta: ");
    	Double novoLimite = s.nextDouble();
    	contaEncontrada.setLimiteCredito(novoLimite);
    	System.out.println("Tipo de conta alterado!");
    	
    	
    }
    
    public static void excluirConta() {
    	System.out.println("\nExcluir Conta\n");
    	
    	if(contas.size() == 0) {
    		System.out.println("Lista vazia");
    	}
    	
    	s.nextLine();
    	
    	System.out.println("Digite o ID da conta:");
    	int idConta = s.nextInt();
    	
    	s.nextLine();
    	
    	ContaBancaria contaEncontrada = pesquisarContaCodigo(idConta);
    	
    	if (contaEncontrada == null) {
    		System.out.println("\nCódigo não cadastrado\n");
    		return;
    	}
    	
    	System.out.printf("\nID.................: %s ", contaEncontrada.getIdConta());
    	System.out.printf("\nAgência............: %s ", contaEncontrada.getAgencia());
    	System.out.printf("\nNúmero da conta....: %s ", contaEncontrada.getNumeroConta());
    	System.out.printf("\nTipo de conta......: %s ", contaEncontrada.getTipo());
    	System.out.printf("\nSaldo...............: R$ %s ", contaEncontrada.getSaldo());
    	System.out.printf("\nLimite de Crédito...: R$ %s ", contaEncontrada.getLimiteCredito());
    	
    	char confirma;
    	
    	do {
    		
    		System.out.println("\nConfirma a exclusçao da conta? [S/N]\n");
    		confirma = s.nextLine().charAt(0);
    		confirma = Character.toUpperCase(confirma);
    		if(confirma != 'S' && confirma != 'N') {
    			continue;
    		}
    		break;
    	} while (true);
    	
    	if(confirma == 'S') {
    		contas.remove(contaEncontrada);
    		
    		System.out.println("Conta excluída!");	
    	}
    	else {
    		System.out.println("Exclusão cancelada!");
    	}
    }
    
    public static void listarContas() {
    	System.out.println("\nListagem de Contas\n");
    	
    	if(contas.size() == 0) {
    		System.out.println("Lista vazia");
    	}
    	
    	System.out.println("-----------------------------------------");
    	System.out.println("ID  Agência  Número  Tipo   Saldo  Limite");
    	System.out.println("-----------------------------------------");
    	
    	for(ContaBancaria cb : contas) {
    			System.out.printf("%-6d %-11s %-10s %1s R$ %.2f  R$ %.2f\n",
    							   cb.getIdConta(),
    							   cb.getAgencia(),
    							   cb.getNumeroConta(),
    							   cb.getTipo(),
    							   cb.getSaldo(),
    							   cb.getLimiteCredito());
    	}
    	
    	System.out.println("-------------------------------------------------");
    }
}

    