package br.alura.loja.dao;

import br.alura.loja.model.Produto;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;

@AllArgsConstructor
public class ProdutoDao {
    private EntityManager em;

    public  void cadastrar(Produto produto) {

        this.em.persist(produto);

    }
}
