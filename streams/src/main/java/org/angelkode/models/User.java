package org.angelkode.models;

public class User {
    private String name;
    private String surname;
    private int id;
    private static int ID_CONTROLLER = 0;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = ++ID_CONTROLLER;
    }

    public User(String name) {
        this.name = name;
        this.surname = null;
        this.id = ++ID_CONTROLLER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
