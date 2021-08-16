package com.woke.teste;

public class ProdutoService {

    private ProdutoRepositorio<Produto> produtoRepositorio;

    public void salvarBancoDeDados(Produto produto) throws Exception {
        validar(produto);

        this.produtoRepositorio.save(produto);
    }

    public void validar(Produto produto) throws Exception {
        if (produto.getNome() == null) {
            throw new Exception("É necessário definir um nome para o produto !");
        }

        if (produto.getCategoria() == null) {
            throw new Exception("É necessário definir uma categoria para o produto !");
        }

        if (produto.getDescricao() == null) {
            throw new Exception("É necessário definir uma descricao para o produto !");
        }

        if (produto.getId() == null) {
            throw new Exception("É necessário definir um codigo para o produto !");
        }
    }
}
