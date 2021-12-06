package com.company;

public abstract class Gods implements Printable{
    private String name;

    public Gods(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
