package exercicio12_heranca;

public class Caminhao {
	private int nrCaminhao;
	private String modelo;
	private int anoFabricacao;
	private int capacidadeTotal;
	protected double cargaAtual;
	private char unidade;
	
	
	public int getNrCaminhao() {
		return nrCaminhao;
	}


	public void setNrCaminhao(int nrCaminhao) {
		this.nrCaminhao = nrCaminhao;
	}


	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}


	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}


	public String getModelo() {
		return modelo;
	}


	public double getCargaAtual() {
		return cargaAtual;
	}


	public char getUnidade() {
		return unidade;
	}


	public Caminhao(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade) {
		this.nrCaminhao = nrCaminhao;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.capacidadeTotal = capacidadeTotal;
		this.unidade = unidade;
	}
	
	


	
	

}
