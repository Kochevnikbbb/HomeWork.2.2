package com.company;

public class Afina extends Gods{
    private String male;

    public Afina(String name, String male) {
        super(name);
        this.male = male;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    @Override
    public void print() {
        System.out.println(getName() + ": pol-" + getMale());
    }
}
