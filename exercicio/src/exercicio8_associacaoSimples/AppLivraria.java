package exercicio8_associacaoSimples;

public class AppLivraria {

	public static void main(String[] args) {
		
		//Cadastrando 3 gêneros
		Genero genero1 = new Genero(001, "Fantasia");
		
		Genero genero2 = new Genero(002, "Comedia");
		
		Genero genero3 = new Genero(003, "Terror");
		
		//Cadastrando 2 editoras
		
		Editora editora1 = new Editora(01, "Carcará", "carara@gmail.com.br", "Taquaritinga do Norte", "PE");
		
		Editora editora2 = new Editora(02, "Ophelia", "ophelia@shakespeareana.com.br", "Palmares", "PE");
		
		
		//Cadastrando 5 livros 
		
		Livro livro1 = new Livro(0001, "Aravis", "00003-4", 200, editora1, genero1);
		
		Livro livro2 = new Livro(0002, "Uma Noite de Ano Novo", "0005-4", 150, editora2, genero2);
		
		Livro livro3 = new Livro(0003, "A Garota de um Olho", "1231-2", 387, editora2, genero3);
		
		Livro livro4 = new Livro(0004, "Lamúrias do Deserto", "2033-6", 234, editora1, genero3);
		
		Livro livro5 = new Livro(0005, "Sonhos em Marte", "1433-9", 170, editora2, genero1);
		
		//exibir livros
		
		mostrarLivro(livro1);
		mostrarLivro(livro2);
		mostrarLivro(livro3);
		mostrarLivro(livro4);
		mostrarLivro(livro5);
		
		
		

	}
	
	
	
	//exibidor livros
	
	public static void mostrarLivro(Livro livro) {
		System.out.println("------------Livro Cadastrado------------");
		System.out.println("Nome........: " + livro.getTitulo());
		System.out.println("Gênero......: " + livro.getGenero().getNomeGenero());
		System.out.println("Razão Social: " + livro.getEditora().getRazaoSocial());
		System.out.println("Cidade......: " + livro.getEditora().getCidade());
		System.out.println();
	}

}
