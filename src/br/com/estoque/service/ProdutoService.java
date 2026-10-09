package br.com.estoque.service;

import br.com.estoque.model.Produto;

import java.util.*;

public class ProdutoService {
    private final List<Produto> produtos =new ArrayList<>();

    private final Set<String> categorias = new HashSet<>();

    private final Map<Integer,Produto> produtosPorId = new HashMap<>();

    public List<Produto> ordenarPorPreco(){
        return produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco))
                .toList();
    }

    public void adicionar(Produto produto){
        produtos.add(produto);

        categorias.add(produto.getCategoria());

        produtosPorId.put(produto.getId(), produto);
    }

    public Produto buscarPorIdMap(Integer id){
        return produtosPorId.get(id);
    }
    public List<Produto> listar(){
        return produtos;
    }

    public Set<String> listarCategorias(){
        return categorias;
    }

    public Produto buscarPorId(Integer id){
        for (Produto produto : produtos){
            if(produto.getId().equals(id)){
                return produto;
            }
        }
        return null;
    }

    public boolean remover(Integer id){
        Produto produto = buscarPorId(id);
        if(produto != null){
            produtos.remove(produto);
            return true;
        }
        return false;
    }
}
