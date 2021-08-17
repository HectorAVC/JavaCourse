package com.company.class2;

import javax.swing.*;

public class Class2 {

    public static void main(String[] args) {
        try {
            String name = JOptionPane.showInputDialog("Como te llamas?");
            String age = JOptionPane.showInputDialog("cuantos años tienes?");
            MyJOptionPane.showMessageDialog(null, "Hola " + name + " tienes " + (Double.parseDouble(age) * 365) + " dias");
            JOptionPane.showMessageDialog(null, "Hola " + name + " tienes " + (Double.parseDouble(age) * 365) + " dias", "Here is the title", 2);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Hola parece que algun dato no es correcto");
        }String address = JOptionPane.showInputDialog("¿Cuál es tu dirección?");
        String Hobby = JOptionPane.showInputDialog("Cuál es tu Hobby?");
        String Height = JOptionPane.showInputDialog("Cual es tu estatura?");
        String Weight = JOptionPane.showInputDialog("Cual es tu peso?");
        Person person = new Person();
        String name;
        person.setName(name);
        person.setAge(age);
        person.setAddress(address);
        person.setHobby(hobby);
        person.setHeight(string Height);
        person.setWeight(string weight);
        JOptionPane.showMessageDialog(null, person.toString());

    }

}
