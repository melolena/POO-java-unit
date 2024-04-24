package exercicio8_associacaoSimples;

public class Livro {
	private int idLivro;
	private String titulo;
	private String isbn;
	private int numeroPaginas;
	private Editora editora;
	private Genero genero;
	
	public Editora getEditora() {
		return editora;
	}

	public Genero getGenero() {
		return genero;
	}

	public String getTitulo() {
		return titulo;
	}
	


	public Livro(int idLivro, String titulo, String isbn, int numeroPaginas, Editora editora, Genero genero) {
		super();
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.isbn = isbn;
		this.numeroPaginas = numeroPaginas;
		this.editora = editora;
		this.genero = genero;
	}
	


}
