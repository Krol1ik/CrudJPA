package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoImpl implements Dao{
    @Override
    public Object findById(int id, Object table) {
        return null;
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
    public void deleteObject(Object object, int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();
        Long key = Long.valueOf(id);
        Object p = entityManager.find(Object.class, key);
        entityManager.remove(p);
        entityManager.getTransaction().commit();

    }

    @Override
    public void updateObject(Object object) {

    }
}
