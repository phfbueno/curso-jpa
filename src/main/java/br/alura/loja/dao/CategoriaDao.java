package br.alura.loja.dao;

import br.alura.loja.enums.Categoria;
import br.alura.loja.model.Produto;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;
import java.util.List;

@AllArgsConstructor
public class CategoriaDao {

    private EntityManager em;

    public  void cadastrar(Categoria categoria) {

        this.em.persist(categoria);

    }

    public void remover(Categoria categoria) {
        this.em.remove(categoria);
    }

    public void atualizar(Categoria categoria) {
        this.em.merge(categoria);
    }


}

