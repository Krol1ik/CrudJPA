package models;

import javax.persistence.*;

@Entity
@Table (name = "Role")
public class Role {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "Role")
    private String role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "id_country")
    private Country country;

    @OneToOne(mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true)
    private User user;

    public Role() {
    }

    public Role(String role, Country country) {
        this.role = role;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", country=" + country +
                ", user=" + user +
                '}';
    }
}
