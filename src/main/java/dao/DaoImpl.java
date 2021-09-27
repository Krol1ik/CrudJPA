package dao;

import models.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static java.lang.Integer.valueOf;

public class DaoImpl implements Dao {
    @Override
    public void findByIdUser(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        int key = valueOf(id);
        User p = entityManager.find(User.class, key);
        System.out.println(p.getName() + " | " + p.getLastName());
        entityManager.getTransaction().commit();
    }




    @Override
    public void saveObject(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(object);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteUserById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        int key = valueOf(id);
        User p = entityManager.find(User.class, key);
        entityManager.remove(p);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateUser(int idUpdate, String newName, String newLastName) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();
        int key = valueOf(idUpdate);
        User p = entityManager.find(User.class, key);
        p.setName(newName);
        p.setLastName(newLastName);
        entityManager.getTransaction().commit();
    }
}
