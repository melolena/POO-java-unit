package exercicio12_heranca;

public class CaminhaoBau extends Caminhao{
	private double volume;
	private double comprimento;
	private double largura;
	private double altura;

	public double getComprimento() {
		return comprimento;
	}


	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}


	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		this.largura = largura;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getVolume() {
		return volume;
	}
	
	
	
	
	
	public CaminhaoBau(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade,
			double comprimento, double largura, double altura) {
		super(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, unidade);
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
	}


	public void carregaBau(double qtdeQuilos) {
		this.cargaAtual += qtdeQuilos/1000;
	}
	
	public void descarregaBau(double qtdeQuilos) {
		this.cargaAtual -= qtdeQuilos /1000; 
	}
	
	
	private double calculaVolume() {
		return comprimento * largura *altura;
	}
	
	
	
	
	

}
