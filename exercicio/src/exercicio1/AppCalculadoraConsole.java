package exercicio1;

public class AppCalculadoraConsole {

	public static void main(String[] args) {

	// Declarando um objeto da classe Calculadora
	 Calculadora calculadora;
	 // Instanciando um objeto da classe Calculadora
	 calculadora = new Calculadora();
	 // Atribuindo dados aos atributos do objeto calc
	 calculadora.operando1 = 9;
	 calculadora.operando2 = 3;
	 // Chamando os métodos do objeto calc. O retorno de cada chamada está sendo exigido.
	 System.out.printf("\nAdição.......: %d", calculadora.adicao());
	 System.out.printf("\nSubtração....: %d", calculadora.subtracao());
	 System.out.printf("\nMultiplicaçao: %d", calculadora.multiplicacao());
	 System.out.printf("\nDivisão......: %d", calculadora.divisao());


	}

}
