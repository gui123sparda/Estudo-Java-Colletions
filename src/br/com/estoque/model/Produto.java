package br.com.estoque.model;

public class Produto {
    private Integer id;
    private String nome;
    private double preco;
    private String categoria;
    private int estoque;

    public Produto(Integer id, String nome, double preco, String categoria, int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = estoque;
    }
    //Getters
    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getEstoque() {
        return estoque;
    }
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{"+"id="+id+", nome='"+nome+
                '\''+", preco="+ preco+
                ", categoria='"+categoria+'\''+
                ", estoque="+estoque+'}';
    }
}
