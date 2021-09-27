package createTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void createUser() {
        String SQL_CREATE = "CREATE TABLE User"
                + "("
                + " ID INTEGER auto_increment primary key,"
                + " Name varchar (30) NOT NULL,"
                + " Last_Name varchar (30) NOT NULL,"
                + " Id_Role INTEGER UNIQUE,"
                + "FOREIGN KEY (Id_Role)  REFERENCES Role (Id)"
                + ");";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/ManyToMany", "root", "pipo123");
             Statement statement = conn.createStatement()) {

            statement.execute(SQL_CREATE);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createRole() {
        String SQL_CREATE = "CREATE TABLE Role"
                + "("
                + " ID INTEGER auto_increment primary key,"
                + " Role varchar (30) NOT NULL,"
                + " Id_Country INTEGER NOT NULL,"
                + "FOREIGN KEY (Id_Country)  REFERENCES Country (Id)"
                + ");";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/ManyToMany", "root", "pipo123");
             Statement statement = conn.createStatement()) {

            statement.execute(SQL_CREATE);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void createCountry() {
        String SQL_CREATE = "CREATE TABLE Country"
                + "("
                + " ID INTEGER auto_increment primary key,"
                + " Country varchar (30) NOT NULL"
                + ");";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/ManyToMany", "root", "pipo123");
             Statement statement = conn.createStatement()) {

            statement.execute(SQL_CREATE);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void createCity() {
        String SQL_CREATE = "CREATE TABLE City"
                + "("
                + " ID INTEGER auto_increment primary key,"
                + " City varchar (30) NOT NULL"
                + ");";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/ManyToMany", "root", "pipo123");
             Statement statement = conn.createStatement()) {

            statement.execute(SQL_CREATE);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createCountryCity() {
        String SQL_CREATE = "CREATE TABLE Country_City"
                + "("
                + " Id_Country INTEGER,"
                + " Id_City INTEGER," +
                " PRIMARY KEY (Id_Country, Id_City)," +
                "CONSTRAINT FK_Country FOREIGN KEY (Id_Country) REFERENCES Country (id)," +
                "CONSTRAINT FK_City FOREIGN KEY (Id_City) REFERENCES City (id)"
                + ")";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/ManyToMany", "root", "pipo123");
             Statement statement = conn.createStatement()) {

            statement.execute(SQL_CREATE);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

