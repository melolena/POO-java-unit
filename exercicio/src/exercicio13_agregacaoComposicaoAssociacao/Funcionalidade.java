package exercicio13_agregacaoComposicaoAssociacao;

public class Funcionalidade {
	private int idFunc;
	private String descricao;
	private int pontoDeFuncao;
	private double custo;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getIdFunc() {
		return idFunc;
	}
	public int getPontoDeFuncao() {
		return pontoDeFuncao;
	}
	public double getCusto() {
		return custo;
	}
	public Funcionalidade(int idFunc) {
		this.idFunc = idFunc;
		
	}
	
	
	public Funcionalidade(String descricao, int pontoDeFuncao) {
		super();
		this.descricao = descricao;
		this.pontoDeFuncao = pontoDeFuncao;
		
		if(idFunc == 0) {
			idFunc = 1;
		}
		idFunc++;
		
	}
	
	private void calculaCusto() {
		custo = pontoDeFuncao * 150;
	}
	
	public void alterarPontoDeFuncao(int pontoDeFuncao) {
		this.pontoDeFuncao = pontoDeFuncao;
		custo = pontoDeFuncao * 150;
	}
	
	
	
}
