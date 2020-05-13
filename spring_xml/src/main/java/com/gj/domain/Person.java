package com.gj.domain;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    private int id;
    private String name;
    private int age;
    private List<String> legs;
    private Map<String,String> legsMap;
    private Set<String> legsSet;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLegs(List<String> legs) {
        this.legs = legs;
    }

    public void setLegsMap(Map<String, String> legsMap) {
        this.legsMap = legsMap;
    }

    public void setLegsSet(Set<String> legsSet) {
        this.legsSet = legsSet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", legs=" + legs +
                ", legsMap=" + legsMap +
                ", legsSet=" + legsSet +
                '}';
    }
}
