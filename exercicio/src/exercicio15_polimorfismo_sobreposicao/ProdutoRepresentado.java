package exercicio15_polimorfismo_sobreposicao;

public class ProdutoRepresentado extends Produto {
	private double percRepresentacao;

	public double getPercRpresentacao() {
		return percRepresentacao;
	}

	public void setPercRpresentacao(double percRepresentacao) {
		this.percRepresentacao = percRepresentacao;
	}

	
	
	public ProdutoRepresentado(String descricao, double precoCusto, double percLucro, double percIcms,
			double percRepresentacao) {
		super(descricao, precoCusto, percLucro, percIcms);
		this.percRepresentacao = percRepresentacao;
	}

	@Override
	public void calculaPrecoVenda() {
		precoVenda = (1+ getPercIcms()/100) * (1 + (percRepresentacao/100))* getPrecoCusto();
	}


	@Override
	public String toString() {
		return  "\nProduto Industrializado" + 
				"\nCódigo                     : " + getCodigo() + 
				"\nDescrição                  : " + getDescricao() + 
				"\nPreço Venda                : R$" + String.format("%.2f", precoVenda) +
				"\nPreço Custo                : R$" + String.format("%.2f", getPrecoCusto()) + 
				"\nPercentual de Lucro        : " + getPercLucro() + 
				"\nPercentual de ICMS         : " + getPercIcms() +
				"\nPercentual de Representação: " + percRepresentacao;
	}
	
	
	
	
}
