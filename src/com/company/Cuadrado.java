package com.company;

public class Cuadrado extends Rectangulo {

    public static final int HOW_MANY_SIDES = 4;

    public static String getInformation() {
        return "Cuadro tiene " + HOW_MANY_SIDES + " Lados";
    }

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
        System.out.println(cantExtend());
        return lado1 * lado2;
    }

    public void doPrintSomething() {
        System.out.println("here");
    }


}
