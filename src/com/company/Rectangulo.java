package com.company;

public class Rectangulo implements Figure{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getSides() {
        return 0;
    }

    @Override
    public double getArea(int a, int b) {
        return 0;
    }


    public final String cantExtend() {
        return "Can't extend this";
    }

}
