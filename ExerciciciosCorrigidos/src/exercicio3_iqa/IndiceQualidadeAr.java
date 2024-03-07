package exercicio3_iqa;

public class IndiceQualidadeAr {
	private double indice;
	private String classificacao;
	private String efeitos;
	
	public void setIndice(double indice) {
		this.indice = indice; //o this sinaliza que é um parâmetro de uma variável local 
	}
	
	public double getIndice() {
		return indice;
	}
	
	public  String getClassificacao() {
		return classificacao;
	}
	
	public String getEfeitos() {
		return efeitos;
	}

	void defineClassificacao() {
		if(indice <= 50) {
			classificacao = "Boa";
		}
		else if(indice <= 100) {
			classificacao = "Regular";
		}
		else if(indice <= 199) {
			classificacao = "Inadequada";
		}
		else if(indice <= 299) {
			classificacao = "Má";
		}
		else if(indice <= 399) {
			classificacao = "Péssima";
		}
		else {
			classificacao = "Crítica";
		}
	}
	
	
	void defineEfeitos() {
		if(indice <= 100) {
			efeitos = "ausência de sintomas";
		}
		else if(indice <= 199) {
			efeitos = "leve agravamento de pessoas suscetíveis";
		}
		else if(indice <= 299) {
			efeitos = "decréscimo de resistência física e significado de agravamento";
		}
		else if(indice <= 399) {
			efeitos = "aparecimento prematuro de certas doenças";
		}
		else {
			efeitos = "morte prematura de pessoas doentes e pessoas idosas";
		}
	}
	
	double comparaIndice(double indiceAnterior){
		return indice - indiceAnterior;
	}
	
}
