package exercicio11_composicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Revista {
    private int codigo;
    private String titulo;
    private int reciclagemProduzida;
    private List<Edicao> listaEdicoes;

    public Revista(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.reciclagemProduzida = 0;
        this.listaEdicoes = new ArrayList<>();
    }

    public void adicionaEdicao(Edicao edicao) {
        listaEdicoes.add(edicao);
    }

    public void removeEdicao(Edicao edicao) {
        listaEdicoes.remove(edicao);
    }

    public String reciclaEdicao(int numero) {
        Edicao edicaoReciclar = null;
        for (Edicao edicao : listaEdicoes) {
            if (edicao.getNumero() == numero) {
                edicaoReciclar = edicao;
                break;
            }
        }

        if (edicaoReciclar == null) {
            return "Edição não encontrada";
        } else if (edicaoReciclar.getQtdeVendida() == edicaoReciclar.getTiragem()) {
            return "Não houve exemplares para reciclar";
        } else if (edicaoReciclar.isReciclou()) {
            return "Edição já reciclada";
        } else {
            int qtdeReciclagem = edicaoReciclar.obtemQtdeReciclagem();
            reciclagemProduzida += qtdeReciclagem;
            edicaoReciclar.reciclaExemplares();
            return "Reciclagem realizada";
        }
    }

}
