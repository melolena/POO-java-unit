package exercicio12_heranca;

public class CaminhaoTanque extends Caminhao{
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	public CaminhaoTanque(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade,
			String tipo) {
		super(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, unidade);
		this.tipo = tipo;
	}

	public void encheTanque() {
		this.cargaAtual = getCapacidadeTotal();
	}
	
	public void esvaziaTanque() {
		this.cargaAtual = 0;
	}
	
	public void abasteceTanque(int qtdeLitros) {
		this.cargaAtual += qtdeLitros;
	}
	
	public void descarregaTanque(int qtdeLitros) {
		this.cargaAtual -= qtdeLitros; 
	}
}
