package exercicio17_interface;

public class Funcionario extends Colaborador {
	private double salario;
	private int anoAdmissao;
	private int mesAdmissao;
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getAnoAdmissao() {
		return anoAdmissao;
	}
	public int getMesAdmissao() {
		return mesAdmissao;
	}

	public Funcionario(String nome, char tipo, double salario, int anoAdmissao, int mesAdmissao) {
		super(nome, tipo);
		this.salario = salario;
		this.anoAdmissao = anoAdmissao;
		this.mesAdmissao = mesAdmissao;
		calculaContribuicao();
	}
	
	public void calculaContribuicao() {
		int mesesTrabalho = (anoAdmissao == 2024) ? (12 - mesAdmissao): 12;
		double percentual =0;
		
		if (tipo =='D') {
			percentual = 0.1;
		}
		else if(tipo == 'G') {
			percentual = 0.08;
		}
		else if(tipo == 'O') {
			percentual = 0.05;
		}
		
		valorContribuicao = (salario * percentual) * (mesesTrabalho/12) ;
	}
	
	@Override
	public String toString() {
		return "\nFuncionário: "+
	"\nID Colaborador    :" +getIdColaborador()+
	"\nNome              :" + getNome()+
	"\nTipo              :" + tipo +
	"\nSalario           :" +salario+
	"\nAno Admissão      :" + anoAdmissao+
	"\nMes Admissão      :" + mesAdmissao+
	"\nValor Contribuição: R$" +String.format("%.2f", valorContribuicao);	
	}
	
}
