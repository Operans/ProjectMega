package com.company.models;

public class Cashier {

    private String name;
    private String login;
    private byte age;


    public Cashier(String name, String login, byte age) {
        this.name = name;
        this.login = login;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

}
