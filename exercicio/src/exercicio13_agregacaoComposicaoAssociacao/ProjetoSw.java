package exercicio13_agregacaoComposicaoAssociacao;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ProjetoSw {
	private int idProjeto;
	private String descricao;
	private Date dataInicio;
	private Date dataFinal;
	private boolean emExecucao;
	private List<Funcionalidade> funcionalidades;
	private Gerente gerente;
	private Cliente cliente;
	private double custoProjeto; 
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getIdProjeto() {
		return idProjeto;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public boolean isEmExecucao() {
		return emExecucao;
	}
	public List<Funcionalidade> getFuncionalidades() {
		return funcionalidades;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public ProjetoSw(String descricao, Date dataInicio, Date dataFinal, List<Funcionalidade> funcionalidades,
			Gerente gerente, Cliente cliente) {

		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.funcionalidades = funcionalidades;
		this.gerente = gerente;
		this.cliente = cliente;
		
		if(idProjeto == 0) {
			idProjeto = 1;
		}
		idProjeto++;
	}
	
	public boolean iniciaProjeto(Gerente gerente) {
		this.gerente = gerente;
		gerente.aloca();
		this.dataInicio = new Date();
		emExecucao = true;
		
		return emExecucao;
	}
	
	public boolean encerraProjeto() {
		gerente.desaloca();
		this.dataFinal = new Date();
		emExecucao = false;
		
		return emExecucao;
	}
	
	
	public void inseriFuncionalidade(String descFunc, int pontoDeFunc) {
		Funcionalidade func = new Funcionalidade(descFunc, pontoDeFunc);
		this.funcionalidades.add(func);
		this.custoProjeto += func.getCusto();	
	}
	
	public boolean removeFuncionalidade(Funcionalidade funcionalidade) {
				this.custoProjeto -= funcionalidade.getCusto();
				this.funcionalidades.remove(funcionalidade);
				return true;
	}
	
	public double consultaCustoProjeto() {
		return this.custoProjeto;
	}
	
	public boolean alterarPontoDeFuncao(int idFunc, int pontoDeFuncao) {
		for (Funcionalidade funciona: funcionalidades) {
			if(funciona.getIdFunc() == idFunc) {
				funciona.alterarPontoDeFuncao(pontoDeFuncao);
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
