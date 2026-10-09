package br.com.estoque.service;

import br.com.estoque.model.Produto;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class ProdutoService {
    private final List<Produto> produtos =new ArrayList<>();

    private final Set<String> categorias = new HashSet<>();


    public void adicionar(Produto produto){
        produtos.add(produto);
        categorias.add(produto.getCategoria());
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
