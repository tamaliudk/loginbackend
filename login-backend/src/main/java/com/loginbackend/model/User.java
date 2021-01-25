package com.loginbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column
    private String username;
    @Column
    private String email;
    @Column
    @JsonIgnore
    private String password;



    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }


    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }
}
