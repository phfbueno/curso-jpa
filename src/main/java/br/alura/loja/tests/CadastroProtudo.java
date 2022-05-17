package br.alura.loja.tests;

import br.alura.loja.model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroProtudo {
    public static void main(String[] args) {
        Produto  celular = new Produto();
        celular.setNome("xiomi MI9");
        celular.setDescricao("produto novo");
        celular.setPreco(BigDecimal.valueOf(999.90));

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(celular);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
