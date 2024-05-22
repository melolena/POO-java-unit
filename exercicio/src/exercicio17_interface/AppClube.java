package exercicio17_interface;
import java.util.ArrayList;
import java.util.List;

public class AppClube {

	public static void main(String[] args) {
		
		//2.1
		
		List <Colaborador> colaboradores = new ArrayList();		List <Terceirizado> terceirizado = new ArrayList();
		
		//2.2
		colaboradores.add(new Funcionario("Maria Clara", 'G', 7000, 2022, 7)); 	
		
		//2.3
		colaboradores.add(new Terceirizado("Juliano Santos", 'P', 4, 6));
		
		//2.4
		for(Colaborador colaborador : colaboradores) {
			System.out.println(colaborador);
		}
		
		//2.5
		double totalContribuicao = 0;
		
		for(Colaborador colaborador : colaboradores) {
			totalContribuicao += colaborador.getValorContribuicao();
		}
		
		System.out.printf("\nTotal Contribuição: R$ %.2f", totalContribuicao);

	}

}