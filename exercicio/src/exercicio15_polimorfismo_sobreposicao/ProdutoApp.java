package exercicio15_polimorfismo_sobreposicao;

public class ProdutoApp {

	public static void main(String[] args) {
		
		
		Produto fornecedor = new Produto("sabonete", 5.00, 10, 4.2);
		
		fornecedor.calculaPrecoVenda();
		
		System.out.println(fornecedor.toString());
		
		Produto industrializado = new ProdutoIndustrializado("Perfume", 20, 6, 2.1, 7);
		
		industrializado.calculaPrecoVenda();
		
		System.out.println(industrializado.toString());
		
		Produto representado = new ProdutoRepresentado("Shampoo", 22, 7, 3, 7);
		
		representado.calculaPrecoVenda();
		
		System.out.println(representado.toString());

	}

}
