package com.company;

public class Main {
    //public static Gods[] gods = new Gods[2];

    public static void main(String[] args) {
	// write your code here
        //gods[0]=new Ares();

        //createObject("Ares").print();
        //createObject("Afina").print();
        //createObject("Zevs").print();


        Printable[] gods = {createObject("Ares"),createObject("Afina"),createObject("Zevs")};
        for (int i = 0; i < gods.length; i++) {
            gods[i].print();
        }
        /*for (Printable a:gods) {
            a.print();
        }*/






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
