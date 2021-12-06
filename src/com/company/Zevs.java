package com.company;

public class Zevs extends Gods{
    private String religia;

    public Zevs(String name, String relegia) {
        super(name);
        this.religia = relegia;
    }

    public String getReligia() {
        return religia;
    }

    public void setReligia(String religia) {
        this.religia = religia;
    }

    @Override
    public void print() {
        System.out.println(getName() + ": religia-" + getReligia());
    }
}
