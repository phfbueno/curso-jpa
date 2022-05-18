package br.alura.loja.dao;

import br.alura.loja.enums.Categoria;
import br.alura.loja.model.Produto;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;

@AllArgsConstructor
public class CategoriaDao {

    private EntityManager em;

    public  void cadastrar(Categoria categoria) {

        this.em.persist(categoria);

    }
}
