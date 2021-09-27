package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table (name = "Country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Country")
    private String country;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Role> roleList;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "country_city",
            joinColumns = {@JoinColumn(name = "id_country")},
            inverseJoinColumns = {@JoinColumn(name = "id_city")}
    )
    List<City> city = new ArrayList<>();

    public Country() {
    }

    public Country(String country, List<City> city) {
        this.country = country;
        this.city = city;
    }

    public List<City> getCity() {
        return city;
    }

    public void setCity(List<City> city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", city=" + city +
                '}';
    }
}
