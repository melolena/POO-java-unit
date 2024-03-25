package exercicio5_embarcaco;

public class Embarcacao {
	private String codigo;
	private String situacao;
	private int pessoasTransportadas;
	private int capacidade;
	

	public Embarcacao(String codigo, int capacidade) {
		this.codigo = codigo;
		this.capacidade = capacidade;
		this.situacao = "Liberado";
		//this.pessoasTransportadas = 0;
	}
	
	public Embarcacao() {
		
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getSituacao() {
		return this.situacao;
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}
	
	public int getPessoasTransportadas() {
		return this.pessoasTransportadas;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
		
	int consultaPessoasTransportadas() {
		return pessoasTransportadas;
	}
	
	void registraEmbarque(int qtdePessoas) {
		this.pessoasTransportadas  += qtdePessoas;
		if (this.pessoasTransportadas >= this.capacidade) {
			this.situacao = "Bloqueado";
		}
	}
	
	void registraDesembarque(int qtdePessoas) {
		this.pessoasTransportadas  -= qtdePessoas;
		if (this.pessoasTransportadas<this.capacidade) {
			this.situacao = "Liberado";
		}
	}
}
