package com.woke.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoServiceTest {

    ProdutoService service = new ProdutoService();

    @Test
    void salvarBancoDeDadosSucesso() {
        Produto produto = new Produto();
        produto.setNome("nome do produto");
        produto.setDescricao("descricao do produto");
        produto.setId((short) 1);
        produto.setCategoria("categoria do produto");

        try {
            service.validar(produto);
            assertTrue(true);
        } catch (Exception e) {
            assertFalse(true);
        }
    }

    @Test
    void salvarBancoDeDadosErro() {
        Produto produto = new Produto();
        produto.setNome("nome do produto");
        produto.setDescricao("descricao do produto");
        produto.setCategoria("categoria do produto");

        try {
            service.validar(produto);
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    void validar() {
    }
}