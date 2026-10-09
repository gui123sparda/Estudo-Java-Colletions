package br.com.estoque;

import br.com.estoque.model.Produto;
import br.com.estoque.service.ProdutoService;

public class Main {
    public static void main(String[] args) {

        ProdutoService service = new ProdutoService();

        Produto p1 = new Produto(
                1,
                "Teclado",
                150.00,
                "Periféricos",
                10
        );

        Produto p2 = new Produto(
                2,
                "Mouse",
                80.00,
                "Periféricos",
                20
        );

        Produto p3 = new Produto(
                3,
                "Monitor",
                900.00,
                "Monitores",
                5
        );

        Produto p4 = new Produto(
                4,
                "MI50 16gb",
                930.00,
                "Hardware",
                10
        );

        service.adicionar(p1);
        service.adicionar(p2);
        service.adicionar(p3);
        service.adicionar(p4);

        System.out.println(service.listarCategorias());
        Produto produto = service.buscarPorIdMap(2);

        System.out.println(produto);
    }
}
