package com.gupta.sarthak.tictactoe.models;

import java.util.Date;

public class User {
    private String name;
    private String email;
    private Date dateOfBirth;

    public User(){

    }
    public User(String name, String email, Date dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }
}
