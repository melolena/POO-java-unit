package exercicio9_jogo;

public class Personagem {
	
	private static int ultimoId = 0; // ele não pertence ao objeto, ele é independente da classe
	
	private int id;
	private String nome;
	private int nivel;
	private int vida;
	private int experiencia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public int getNivel() {
		return nivel;
	}
	public int getVida() {
		return vida;
	}
	public int getExperiencia() {
		return experiencia;
	}
	// o construtor é para iniciar os objetos 
	
	public Personagem(String nome, int vida) {
		this.id = ++ultimoId;
		this.nome = nome;
		this.vida = vida;
		this.nivel = 1;
		this.experiencia = 0;
	}
	
	
	public int realizaAtaque() {
		if(vida != 0) {	
			// o impactos [] está calculando a posição do vetor de dano por nível mediante a subtração 
			//nivel -1, que vai ser de acordo com as posições corretas 0, 1, 2
			int [] impactos = {40, 80, 120};
			experiencia += impactos[nivel-1];
		}
		if(experiencia >=200) {
			nivel ++;
			experiencia = 0;
			nivel = nivel >3 ? 3 : nivel; // operador ternário, '?' é verdadeiro ':' é falso
			/*se o nível for maior igual a 3 ele será verdadeiro, se não ele vai ser o nível indicado*/
		}
		return experiencia;
	}
	
	public boolean ReceberAtaque(int dano) {
		if(vida!= 0) {	
			if(nivel == 1) {
				vida--;
				return true;
			}
			else if(nivel == 2 && dano >= 50) {
				vida--;
				return true;
			}
			else if(nivel ==3 && dano >= 100){
				vida --;
				return true;
			}
		}
		return false;
		
	}
	
	
	

}
