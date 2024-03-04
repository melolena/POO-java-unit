package exercicio3_iqa;

public class IndiceQualidadeAr {
	double indice;
	double indiceAnterior;
	double comparacao;
	String classificacao;
	String efeitos;
	
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
	
	
	double compareIndice(double indiceAnterior) {
		
		comparacao = indice - indiceAnterior;
		
		return comparacao;
	}
	
	String diferenca(double comparacao) {
		if(comparacao > 0) {
			return "A qualidade do ar piorou";
		}
		 else if(comparacao < 0) {
			return "A qualidade do ar melhorou";
		}
		else {
			return "A qualidade do ar se mantém estável";
		}
	}

}
