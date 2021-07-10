package com.company;

public class Cuadrado implements Figure {

    @Override
    public String getName() {
        return "Cuadro";
    }

    @Override
    public int getSides() {
        return 4;
    }


    @Override
    public double getArea(int lado1, int lado2) {
        return lado1 * lado2;
    }

    public void doPrintSomething() {
        System.out.println("here");
    }
}
