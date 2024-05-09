package exercicio13_agregacaoComposicaoAssociacao;

public class Gerente {
	private String cpf;
	private String nome;
	private boolean disponivel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	
	public Gerente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		this.disponivel = false;
	} 
	
	public void aloca() {
		disponivel = false;
	}
	
	public void desaloca() {
		disponivel = true;
		
	}
	
	
	
	
}
