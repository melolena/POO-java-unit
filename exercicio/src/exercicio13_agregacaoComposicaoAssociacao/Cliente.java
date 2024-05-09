package exercicio13_agregacaoComposicaoAssociacao;

public class Cliente {
	private String cnpj;
	private String razaoSocial;
	private String telefone;
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCnpj() {
		return cnpj;
	}
	
	public Cliente(String cnpj, String razaoSocial, String telefone) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.telefone = telefone;
	}
	
	
	
}
