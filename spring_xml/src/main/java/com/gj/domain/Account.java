package com.gj.domain;

public class Account {
    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                '}';
    }
}
