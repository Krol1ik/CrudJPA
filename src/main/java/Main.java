import createTable.CreateTable;
import dao.DaoImpl;
import models.City;
import models.Country;
import models.Role;
import models.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {

//        CreateTable.createCountry();
//        CreateTable.createCity();
//        CreateTable.createCountryCity();
//        CreateTable.createRole();
//        CreateTable.createUser();

        DaoImpl dao = new DaoImpl();

//              Создание значений во всех таблицах всех полей
//        City city = new City("Minsk");
//        List<City> cityList = new ArrayList<>();
//        cityList.add(city);
//        Country country = new Country("UKR", cityList);
//        dao.saveObject(country);
//        Role role = new Role("Customer", country);
//        dao.saveObject(role);
//        User user = new User("Tom", "White", role);
//        dao.saveObject(user);


//              Обновление данных и после вывод юзера по ID
//        dao.updateUser(3, "Henry", "Smit");
//        dao.findByIdUser(3);

        dao.deleteUserById(4);
    }
}
