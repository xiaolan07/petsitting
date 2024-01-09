package com.example.demo.model.dto;

import com.example.demo.model.jpa.AnnonceJpa;
import jakarta.persistence.*;

/**
 * @author jixia
 * @Description TODO
 * @date 25/12/2023-15:16
 */
public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;

    @Column(unique = true)
    String email;
    String password;
    Boolean isPublier;

    String avator;


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

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }
}
