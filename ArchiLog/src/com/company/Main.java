package com.company;

public class Main {

    public static void main(String[] args) {

        Model m = new Model("", "", 0.0);
        Vue v = new Vue("Modèle MVC");
        Controlleur c = new Controlleur(m,v);
        c.initControlleur();

    }
}
