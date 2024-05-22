package exercicio17_interface;

public abstract class Colaborador implements IColaborador{
	private int idColaborador;
	private String nome;
	public static char tipo;
	protected double valorContribuicao;
	private static int contador = 1;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public int getIdColaborador() {
		return idColaborador;
	}
	public double getValorContribuicao() {
		return valorContribuicao;
	}
	public int getContador() {
		return contador;
	}
	
	
	public Colaborador(String nome, char tipo) {
		super();
		this.nome = nome;
		this.tipo = Character.toUpperCase(tipo);
		this.idColaborador += contador++;
	}
	
}