package oak;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Cadastro {
    private double valor;
    private String disponivel_venda;
    private String nome_produto;
    private String descricao;
    private List<Produto> produtos = new ArrayList<>();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDisponivel_venda() {
        return disponivel_venda;
    }

    public void setDisponivel_venda(String disponivel_venda) {
        this.disponivel_venda = disponivel_venda;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    Scanner s = new Scanner(System.in);

    public void cadastrarProduto() {
        System.out.println("=====Cadastramento=====");
        System.out.println("Digite o nome do produto:");
        setNome_produto(s.nextLine());
        System.out.println("Digite a descrição do produto: ");
        setDescricao(s.nextLine());
        System.out.println("Digite o valor do produto:");
        setValor(s.nextDouble());
        System.out.println("Está disponível para venda? (preencha Sim ou Não)");
        setDisponivel_venda(s.nextLine().toUpperCase());

        if (!disponivel_venda.equals("SIM") && !disponivel_venda.equals("NÃO")) {
            System.out.println("Valor inválido, tente novamente");
        }

        Produto novoProduto = new Produto(nome_produto, descricao, valor, disponivel_venda);
        produtos.add(novoProduto);

        System.out.println("Produto cadastrado com sucesso! \n");

        listarProdutos();
    }

    public void listarProdutos() {
        System.out.println("===== Lista de Produtos =====");
        System.out.println("Nome ===  Valor");

        for (Produto pdt : produtos) {
            System.out.println(pdt.getNome_produto() + "===" + pdt.getValor());
        }
    }
}
