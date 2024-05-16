package exercicio14_polimorfismo_heranca;

public class Personagem {
	
	private static int ultimoId =0;
	private int id;
	private String nome;
	private int pontos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public int getPontos() {
		return pontos;
	}
	public Personagem(String nome, int pontos) {
		ultimoId++;
		this.id = ultimoId;
		this.nome = nome;
		this.pontos = pontos;
	}
	
	public void recebeGolpe(int aceleracao) {
		this.pontos -= aceleracao;
	}
	
	public void recebeGolpe (char tipoArma, int aceleracao) {
		final double indice =1.4;
		final int ataqueManual = 2* aceleracao;
		final int ataqueMecanico = (int) Math.ceil(indice * ataqueManual);
		final int ataqueEletronico = (int) Math.ceil(ataqueMecanico*indice);
		if(tipoArma =='m') {
			this.pontos -= ataqueManual;
		}
		else if(tipoArma == 'M') {
			this.pontos -= ataqueMecanico;
		}
		else {
			this.pontos -= ataqueEletronico;
		}
	}
	
	@Override
	public String toString() {
		return "Personagem{" +
		   "id= " +id+ 
		   ", nome =" +nome +"/" +
		   ",pontos =" +pontos +
		   '}';
	}
	
	
	
}
