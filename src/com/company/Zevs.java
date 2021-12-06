package com.company;

public class Zevs extends Gods{
    private String relegia;

    public Zevs(String name, String relegia) {
        super(name);
        this.relegia = relegia;
    }

    public String getRelegia() {
        return relegia;
    }

    public void setRelegia(String relegia) {
        this.relegia = relegia;
    }

    @Override
    public void print() {
        System.out.println(getName() + ": religia-" + getRelegia());
    }
}
