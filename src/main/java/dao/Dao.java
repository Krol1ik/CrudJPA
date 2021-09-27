package dao;

public interface Dao {
    public Object findById (int id, Object table);
    public void saveObject (Object object);
    public void deleteObject (Object object, int id);
    public void updateObject (Object object);
}
