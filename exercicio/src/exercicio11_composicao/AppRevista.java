package exercicio11_composicao;

public class AppRevista {
	  Revista revista = new Revista(1, "Revista de Sustentabilidade");

      // 2.2 - Adicionar 3 edições na revista cadastrada
      revista.adicionaEdicao(new Edicao(52, 1000));
      revista.adicionaEdicao(new Edicao(53, 900));
      revista.adicionaEdicao(new Edicao(54, 1200));

      // 2.3 - Informar as vendas das edições cadastradas
      revista.listaEdicoes.get(0).informaVenda(800);
      revista.listaEdicoes.get(1).informaVenda(900);
      revista.listaEdicoes.get(2).informaVenda(1000);

      // 2.4 - Reciclar a edição 53
      exibirReciclagem(revista.reciclaEdicao(53), revista);

      // 2.5 - Reciclar a edição 54
      exibirReciclagem(revista.reciclaEdicao(54), revista);

      // 2.6 - Reciclar a edição 54 novamente
      exibirReciclagem(revista.reciclaEdicao(54), revista);

      // 2.7 - Reciclar a edição 99 (que não existe)
      exibirReciclagem(revista.reciclaEdicao(99), revista);
  }

  public static void exibirReciclagem(String resultado, Revista revista) {
      System.out.println(resultado);
      System.out.println("Reciclagem Produzida: " + revista.reciclagemProduzida);
      for (Edicao edicao : revista.listaEdicoes) {
          System.out.println("Edição " + edicao.getNumero() + ": Reciclou? " + edicao.isReciclou());
      }
      System.out.println("-----------------------");
  }
}
