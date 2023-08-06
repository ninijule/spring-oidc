package fr.beutin.julian.demo.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    public User(String name) {
        this.name = name;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
