package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        createObject("Ares").print();
        createObject("Afina").print();
        createObject("Zevs").print();


    }
    public static Printable createObject(String Gods){
        Printable printable = null;
        switch (Gods){
            case "Ares":
                printable = new Ares("Ares","GODofWAR");
                break;
            case "Afina":
                printable = new Afina("Afina","Женщина");
                break;
            case "Zevs":
                printable = new Zevs("Zevs","Islam");
                break;
        }
        return printable;
    }
}
