package exercicio17_interface;

public class Terceirizado extends Colaborador {
	private int diasSemana;
	private int horasDia;
	
	public int getDiasSemana() {
		return diasSemana;
	}
	
	public void setDiasSemana(int diasSemana) {
		this.diasSemana = diasSemana;
	}
	public int getHorasDia() {
		return horasDia;
	}
	public void setHorasDia(int horasDia) {
		this.horasDia = horasDia;
	}

	public Terceirizado(String nome, char tipo, int diasSemana, int horasDia) {
		super(nome, tipo);
		this.diasSemana = diasSemana;
		this.horasDia = horasDia;
		calculaContribuicao();
		
	}
	
	public void calculaContribuicao() {
		
		if(tipo== 'T') {
			valorContribuicao = 0;
		}
		else {
			int cargaHoraria = diasSemana * horasDia;
			
			if(cargaHoraria <= 16) {
				valorContribuicao = 80;
			}
			else if(cargaHoraria <= 24) {
				valorContribuicao = 150;
			}
			else {
				valorContribuicao = 250;
			}
		}
		
	}
	
	@Override
	public String toString() {
		return "\nFuncionário: "+
	"\nID Colaborador    :" +getIdColaborador()+
	"\nNome              :" + getNome()+
	"\nTipo              :" + tipo +
	"\nDias da semana    :" +diasSemana+
	"\nHoras por dia     :" + horasDia+
	"\nValor Contribuição: R$" + String.format("%.2f",valorContribuicao);	
	}
	
	
}
