package exercicio15_polimorfismo_sobreposicao;

public class ProdutoIndustrializado extends Produto {
	private double percIpi;
	
	public double getPercIpi() {
		return percIpi;
	}

	public void setPercIpi(double percIpi) {
		this.percIpi = percIpi;
	}

	public ProdutoIndustrializado(String descricao, double precoCusto, double percLucro, double percIcms,
			double percIpi) {
		super(descricao, precoCusto, percLucro, percIcms);
		this.percIpi = percIpi;
	}
	
	@Override
	public void calculaPrecoVenda() {
		 precoVenda = (1+ getPercIcms()/100) * (1 +percIpi /100) * getPrecoCusto() * (1* getPercLucro());
	}
	
	@Override
	public String toString() {
		return  "\nProduto Industrializado" + 
				"\nCódigo             : " + getCodigo() + 
				"\nDescrição          : " + getDescricao() + 
				"\nPreço Venda        : R$" + String.format("%.2f", precoVenda) +
				"\nPreço Custo        : R$" + String.format("%.2f", getPrecoCusto()) + 
				"\nPercentual de Lucro: " + getPercLucro() + 
				"\nPercentual de ICMS : " + getPercIcms() +
				"\nPercentual de IPI  :" + percIpi;
	}
	
}
