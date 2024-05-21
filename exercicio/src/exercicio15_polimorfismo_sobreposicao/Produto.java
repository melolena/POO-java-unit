package exercicio15_polimorfismo_sobreposicao;

public class Produto {
	private String codigo; 
	private String descricao;
	private double precoCusto;
	protected double precoVenda;
	private double percLucro;
	private double percIcms;
	private int contador = 000;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public double getPercLucro() {
		return percLucro;
	}
	public void setPercLucro(double percLucro) {
		this.percLucro = percLucro;
	}
	public double getPercIcms() {
		return percIcms;
	}
	public void setPercicms(double percicms) {
		this.percIcms = percicms;
	}
	public String getCodigo() {
		return codigo;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public Produto(String descricao, double precoCusto, double percLucro, double percIcms) {
		super();
		this.codigo = Integer.toString(contador++);
		this.descricao = descricao;
		this.precoCusto = precoCusto;
		this.percLucro = percLucro;
		this.percIcms = percIcms;
	}
	
	
	public void calculaPrecoVenda() {
		this.precoVenda = (1 +(percIcms/100)) * (1 + (percLucro/100)) * precoCusto;
	}
	
	public String toString() {
		return  "\nProduto Industrializado" + 
				"\nCódigo                   : " + codigo + 
				"\nDescrição                : " + descricao + 
				"\nPreço Venda              : R$" + String.format("%.2f", precoVenda) + 
				"\nPreço Custo              : R$" + String.format("%.2f", precoCusto) + 
				"\nPercentual de Lucro      : " + percLucro + 
				"\nPercentual de ICMS       : " + percIcms; 
	}
	
	
}
