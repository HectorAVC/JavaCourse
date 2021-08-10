package com.company.class2;

import javax.swing.*;

public class Class2 {

    public static void main(String[] args) {
        try {
            String name = JOptionPane.showInputDialog("Como te llamas?");
            String age = JOptionPane.showInputDialog("cuantos años tienes?");
            Persona persona = new Persona();
            persona.setFirstName(name);
            MyJOptionPane.showMessageDialog(null, "Hola " + name + " tienes " + (Double.parseDouble(age) * 365) + " dias");
            JOptionPane.showMessageDialog(null, "Hola " + name + " tienes " + (Double.parseDouble(age) * 365) + " dias", "Here is the title", 2);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Hola parece que algun dato no es correcto");
        }
    }

}
