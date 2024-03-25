package exercicio5_embarcaco;
import java.util.Scanner;

public class AppEmbarcacaoArray2 {
	static Embarcacao embarcacoes[] = new Embarcacao[5];
	static Scanner input = new Scanner(System.in);		
	static int contEmbarcacao=0;
	
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
	
	public static int pesquisaEmbarcacaoPorCodigo(String codigo) {
		for (int i = 0; i < embarcacoes.length; i++) {
			if (embarcacoes[i] != null && codigo.equals(embarcacoes[i].getCodigo())) {
				return i;
			}
		}
		return -1;
	}
	
	public static void cadastraEmbarcacao() {
		System.out.println("\n*** Cadastro de Embarcacao ***\n");
		
		if (contEmbarcacao == embarcacoes.length) {
			System.out.println("Vetor cheio");
			return;
		}
		input.nextLine();
		System.out.printf("\nCódigo da embarcação: ");
		String codigo = input.nextLine();
		
		if (pesquisaEmbarcacaoPorCodigo(codigo) != -1) {
			System.out.println("\n-- Código já cadastrado --\n");
			return;
		}	

		System.out.printf("\nCapacidade da embarcação: ");
		int capacidade = input.nextInt();
		
		embarcacoes[contEmbarcacao]= new Embarcacao(codigo, capacidade);
		contEmbarcacao++;
		System.out.println("\n-- Cadastro efetuado --\n");				

	
		
	}

	public static void consultaEmbarcacao() {
		System.out.println("\n*** Consulta de Embarcação ***\n");
		if (contEmbarcacao ==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		input.nextLine();
		System.out.printf("\nCódigo da embarcação: ");
		String codigo = input.nextLine();
		
		int posicaoEncontrada = pesquisaEmbarcacaoPorCodigo(codigo);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nCódigo...............: %s\n", embarcacoes[posicaoEncontrada].getCodigo());
		System.out.printf("\nSituacao.............: %s", embarcacoes[posicaoEncontrada].getSituacao());
		System.out.printf("\nCapacidade...........: %d", embarcacoes[posicaoEncontrada].getCapacidade());
		System.out.printf("\nPessoas transportadas: %d", embarcacoes[posicaoEncontrada].getPessoasTransportadas());				
	}
	
	public static void alteraEmbarcacao() {
		System.out.println("\n*** Alteração de Embarcação ***\n");
		if (contEmbarcacao ==0) {
			System.out.println("Vetor vazio");
			return;
		}

		input.nextLine();
		System.out.printf("\nCódigo da embarcação: ");
		String codigo = input.nextLine();
		
		int posicaoEncontrada = pesquisaEmbarcacaoPorCodigo(codigo);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nCódigo...............: %s\n", embarcacoes[posicaoEncontrada].getCodigo());
		System.out.printf("\nSituacao.............: %s", embarcacoes[posicaoEncontrada].getSituacao());
		System.out.printf("\nCapacidade...........: %d", embarcacoes[posicaoEncontrada].getCapacidade());
		System.out.printf("\nPessoas transportadas: %d", embarcacoes[posicaoEncontrada].getPessoasTransportadas());				

		System.out.println("\nNova capacidade: ");
		int novaCapacidade = input.nextInt();
		embarcacoes[posicaoEncontrada].setCapacidade(novaCapacidade);
		System.out.println("Capacidade de pessoas na embarcação alterado");
	}
	
	public static void excluiEmbarcacao() {
		System.out.println("\n*** Exclusão de Embarcacao ***\n");
		if (contEmbarcacao ==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		input.nextLine();
		System.out.printf("\nCódigo da embarcação: ");
		String codigo = input.nextLine();
		
		int posicaoEncontrada = pesquisaEmbarcacaoPorCodigo(codigo);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nCódigo...............: %s\n", embarcacoes[posicaoEncontrada].getCodigo());
		System.out.printf("\nSituacao.............: %s", embarcacoes[posicaoEncontrada].getSituacao());
		System.out.printf("\nCapacidade...........: %d", embarcacoes[posicaoEncontrada].getCapacidade());
		System.out.printf("\nPessoas transportadas: %d", embarcacoes[posicaoEncontrada].getPessoasTransportadas());				
		
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
			
			embarcacoes[posicaoEncontrada] = null;
						
			System.out.println("-- Exclusão efetuada");	
			contEmbarcacao--;
		}
		else {
			System.out.println("-- Exclusão cancelada");
		}				
	}
	
	public static void listaEmbarcacaoes() {
		System.out.println("\n*** Listagem de Embarcacao ***\n");
		
		if (contEmbarcacao ==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		System.out.println("=====================================");
		System.out.println("Codigo Status      Capacidade Pessoas   ");
		System.out.println("=====================================");

		for (int i = 0; i < embarcacoes.length; i++) {
			if (embarcacoes[i] != null) {
				System.out.printf("%-6s %-11s %10d %7d\n", 
				  		  embarcacoes[i].getCodigo(),
						  embarcacoes[i].getSituacao(),
						  embarcacoes[i].getCapacidade(),
						  embarcacoes[i].getPessoasTransportadas());				
			}
			//else {
			//	System.out.printf("%dº Elemento nulo\n", i+1);
			//}
		}		
		System.out.println("=====================================");
	}
}
