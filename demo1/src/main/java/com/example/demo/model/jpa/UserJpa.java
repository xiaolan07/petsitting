package com.example.demo.model.jpa;

import jakarta.persistence.*;

/**
 * @author jixia
 * @Description TODO
 * @date 2023-09-03-16:10
 */
@Entity(name = "user")
public class UserJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;

    @Column(unique = true)
    String email;
    String password;
    Boolean isPublier;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private AnnonceJpa annonce;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getPublier() {
        return isPublier;
    }

    public void setPublier(Boolean publier) {
        isPublier = publier;
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

    public AnnonceJpa getAnnonce() {
        return annonce;
    }

    public void setAnnonce(AnnonceJpa annonce) {
        this.annonce = annonce;
    }
}



