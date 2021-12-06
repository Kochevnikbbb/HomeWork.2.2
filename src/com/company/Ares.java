package com.company;

public class Ares extends Gods{
    private String power;

    public Ares(String name, String power) {
        super(name);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public void print() {
        System.out.println(getName() + ": power-" + getPower());
    }
}
