import createTable.CreateTable;
import dao.DaoImpl;
import models.City;
import models.Country;
import models.Role;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        CreateTable.createCountry();
//        CreateTable.createCity();
//        CreateTable.createCountryCity();
//        CreateTable.createRole();
//        CreateTable.createUser();

        DaoImpl dao = new DaoImpl();

        City city = new City("Minsk");
        List<City> cityList = new ArrayList<>();
        cityList.add(city);
        Country country = new Country("UKR", cityList);
        dao.saveObject(country);
        Role role = new Role("Customer", country);
        dao.saveObject(role);
        User user = new User("Tom", "White", role);
        dao.saveObject(user);


    }
}
