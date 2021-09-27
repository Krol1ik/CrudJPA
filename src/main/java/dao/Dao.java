package dao;

import models.User;

public interface Dao {
    public void findByIdUser(int id);
    public void saveObject (Object object);
    public void deleteUserById(int id);
    public void updateUser(int idUpdate, String newName, String newLastName);
}
