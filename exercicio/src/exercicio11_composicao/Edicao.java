package exercicio11_composicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Edicao {
	private int numero;
    private Date data;
    private int tiragem;
    private int qtdeVendida;
    private boolean reciclou;

    public Edicao(int numero, int tiragem) {
        this.numero = numero;
        this.data = new Date();
        this.tiragem = tiragem;
        this.qtdeVendida = 0;
        this.reciclou = false;
    }

    public void informaVenda(int qtde) {
        this.qtdeVendida += qtde;
    }

    public int obtemQtdeReciclagem() {
        return tiragem - qtdeVendida;
    }

    public String reciclaExemplares() {
        if (reciclou) {
            return "Edição já reciclada";
        } else {
            reciclou = true;
            return "Reciclagem realizada";
        }
    }
}

