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

        Produto p5 = new Produto(
                5,
                "Headset",
                250.00,
                "Periféricos",
                15
        );

        Produto p6 = new Produto(
                6,
                "Webcam",
                320.00,
                "Periféricos",
                8
        );

        Produto p7 = new Produto(
                7,
                "SSD 1TB",
                450.00,
                "Hardware",
                12
        );

        Produto p8 = new Produto(
                8,
                "Placa de vídeo",
                1800.00,
                "Hardware",
                4
        );

        Produto p9 = new Produto(
                9,
                "Monitor 24 polegadas",
                1100.00,
                "Monitores",
                6
        );

        service.adicionar(p1);
        service.adicionar(p2);
        service.adicionar(p3);
        service.adicionar(p4);
        service.adicionar(p5);
        service.adicionar(p6);
        service.adicionar(p7);
        service.adicionar(p8);
        service.adicionar(p9);

        System.out.println(service.listarCategorias());
        Produto produto = service.buscarPorIdMap(2);



        service.ordenarPorPreco()
                .forEach(System.out::println);

        System.out.println("");
        System.out.println("");

        service.ordenarPorPrecoDesc()
                .forEach(System.out::println);
    }
}
