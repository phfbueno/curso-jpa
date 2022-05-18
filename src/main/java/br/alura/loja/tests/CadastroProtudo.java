package br.alura.loja.tests;

import br.alura.loja.dao.CategoriaDao;
import br.alura.loja.dao.ProdutoDao;
import br.alura.loja.enums.Categoria;
import br.alura.loja.model.Produto;
import br.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroProtudo {
    public static void main(String[] args) {
        Categoria celuares = new Categoria();
        celuares.setNome("CELULARES");

        Produto  celular = new Produto();
        celular.setNome("xiomi MI9");
        celular.setDescricao("produto novo");
        celular.setPreco(BigDecimal.valueOf(999.90));
        celular.setCategoria(celuares);

        EntityManager entityManager = JPAUtil.getEntityManeger();

        ProdutoDao produtoDao = new ProdutoDao(entityManager);
        CategoriaDao categoriaDao = new CategoriaDao(entityManager);

        entityManager.getTransaction().begin();
        categoriaDao.cadastrar(celuares);
        produtoDao.cadastrar(celular);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
