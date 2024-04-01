package exercicio5_embarcaco;

import java.util.ArrayList;
import java.util.Scanner;

import exercicio5_embarcaco.Embarcacao;

public class AppEmbarcacaoLista {
	

	static ArrayList<Embarcacao> embarcacoes = new ArrayList();
	static Scanner input = new Scanner(System.in);		
	
	public static void main(String[] args) {

		int opcao = 0;
		do {
			System.out.println("\n*** Seletor de Opções ***");
			System.out.println();
			System.out.println("1 - Cadastrar Embarcação");
			System.out.println("2 - Consultar Embarcação");
			System.out.println("3 - Alterar Embarcação");
			System.out.println("4 - Excluir Embarcação");
			System.out.println("5 - Listar Embarcações");
			System.out.println("0 - Finalizar");

			System.out.print("\nOpção: ");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				cadastraEmbarcacao();
				break;
			case 2:
				consultaEmbarcacao();
				break;
			case 3:
				alteraEmbarcacao();
				break;
			case 4:
				excluiEmbarcacao();
				break;
			case 5:
				listaEmbarcacaoes();
				break;
			case 0:
				System.out.println("\n--- PROGRAMA FINALIZADO");
				break;
			default:
				System.out.println("\nOpção incorreta");			
			}
			
		} while (opcao !=0);
		input.close();
	}
	
	public static Embarcacao pesquisaEmbarcacaoPorCodigo(String codigo) {
		for (Embarcacao emb: embarcacoes) {
			if (emb != null && codigo.equals(emb.getCodigo())) {
				return emb;
			}
		}
		return null;
	}
	
	public static void cadastraEmbarcacao() {
		System.out.println("\n*** Cadastro de Embarcacao ***\n");
		
		input.nextLine();
		System.out.printf("\nCódigo da embarcação: ");
		String codigo = input.nextLine();
		
		if (pesquisaEmbarcacaoPorCodigo(codigo) != null) {
			System.out.println("\n-- Código já cadastrado --\n");
			return;
		}	

		System.out.printf("\nCapacidade da embarcação: ");
		int capacidade = input.nextInt();
		
		Embarcacao embarcacao = new Embarcacao(codigo, capacidade);
		embarcacoes.add(embarcacao);
	
		System.out.println("\n-- Cadastro efetuado --\n");				
		
	}

	public static void consultaEmbarcacao() {
		System.out.println("\n*** Consulta de Embarcação ***\n");
		if (embarcacoes.size()==0) {
			System.out.println("Lista vazia");
			return;
		}
		
		input.nextLine();
		System.out.printf("\nCódigo da embarcação: ");
		String codigo = input.nextLine();
		
		Embarcacao embarcacaoEncontrada = pesquisaEmbarcacaoPorCodigo(codigo);
		
		if (embarcacaoEncontrada == null) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nCódigo...............: %s\n", embarcacaoEncontrada.getCodigo());
		System.out.printf("\nSituacao.............: %s", embarcacaoEncontrada.getSituacao());
		System.out.printf("\nCapacidade...........: %d", embarcacaoEncontrada.getCapacidade());
		System.out.printf("\nPessoas transportadas: %d", embarcacaoEncontrada.getPessoasTransportadas());				
	}
	
	public static void alteraEmbarcacao() {
		System.out.println("\n*** Alteração de Embarcação ***\n");
		if (embarcacoes.size()==0) {
			System.out.println("Lista vazia");
			return;
		}

		input.nextLine();
		System.out.printf("\nCódigo da embarcação: ");
		String codigo = input.nextLine();
		
		Embarcacao embarcacaoEncontrada = pesquisaEmbarcacaoPorCodigo(codigo);
		
		if (embarcacaoEncontrada == null) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nCódigo...............: %s\n", embarcacaoEncontrada.getCodigo());
		System.out.printf("\nSituacao.............: %s", embarcacaoEncontrada.getSituacao());
		System.out.printf("\nCapacidade...........: %d", embarcacaoEncontrada.getCapacidade());
		System.out.printf("\nPessoas transportadas: %d", embarcacaoEncontrada.getPessoasTransportadas());				

		System.out.println("\nNova capacidade: ");
		int novaCapacidade = input.nextInt();
		embarcacaoEncontrada.setCapacidade(novaCapacidade);
		System.out.println("Capacidade de pessoas na embarcação alterado");
	}
	
	public static void excluiEmbarcacao() {
		System.out.println("\n*** Exclusão de Embarcacao ***\n");
		if (embarcacoes.size()==0) {
			System.out.println("Lista vazia");
			return;
		}
		
		input.nextLine();
		System.out.printf("\nCódigo da embarcação: ");
		String codigo = input.nextLine();
		
		Embarcacao embarcacaoEncontrada = pesquisaEmbarcacaoPorCodigo(codigo);
		
		if (embarcacaoEncontrada == null) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nCódigo...............: %s\n", embarcacaoEncontrada.getCodigo());
		System.out.printf("\nSituacao.............: %s", embarcacaoEncontrada.getSituacao());
		System.out.printf("\nCapacidade...........: %d", embarcacaoEncontrada.getCapacidade());
		System.out.printf("\nPessoas transportadas: %d", embarcacaoEncontrada.getPessoasTransportadas());				
		
		char confirma;
		do {
			System.out.printf("\nConfirma exclusão [S/N]: ");
			confirma = input.nextLine().charAt(0);
			confirma = Character.toUpperCase(confirma);
			if(confirma!='S' && confirma!='N') {
				continue;
			}
			break;
		} while (true);
		
		if (confirma=='S') {
			
			embarcacoes.remove(embarcacaoEncontrada);
						
			System.out.println("-- Exclusão efetuada");	

		}
		else {
			System.out.println("-- Exclusão cancelada");
		}				
	}
	
	public static void listaEmbarcacaoes() {
		System.out.println("\n*** Listagem de Embarcacao ***\n");
		
		if (embarcacoes.size()==0) {
			System.out.println("Lista vazia");
			return;
		}
		
		System.out.println("=====================================");
		System.out.println("Codigo Status      Capacidade Pessoas   ");
		System.out.println("=====================================");

		for (Embarcacao emb : embarcacoes) {
				System.out.printf("%-6s %-11s %10d %7d\n", 
				  		  emb.getCodigo(),
						  emb.getSituacao(),
						  emb.getCapacidade(),
						  emb.getPessoasTransportadas());				
		}		
		System.out.println("=====================================");		
	}
}