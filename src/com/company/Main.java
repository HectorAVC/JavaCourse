package com.company;

import com.company.class2.Person;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
		List<Figure> figuras = new ArrayList<>();
		Figure triangulo1 = new Triangulo();
		Figure triangulo2 = new Triangulo();
		Figure cuadro1 = new Cuadrado();
		figuras.add(triangulo1);
		figuras.add(triangulo2);
		figuras.add(cuadro1);
		triangulo1.getName();
		System.out.println(triangulo1.getName());
		System.out.println(triangulo1.getArea(10, 9));
		System.out.println(triangulo1.toString());
		System.out.println(triangulo2.toString());
		System.out.println(cuadro1.getName());
		System.out.println(cuadro1.getArea(10, 10));
		System.out.println(Cuadrado.HOW_MANY_SIDES);
		System.out.println(Cuadrado.getInformation());
		System.out.println(Math.PI);
		String name = JOptionPane.showInputDialog("Como te llamas?");
		String age = JOptionPane.showInputDialog("cuantos años tienes?");
		JOptionPane.showMessageDialog(null, "Hola " + name + " tienes " + (Integer.parseInt(age) * 365) + " dias");
		String address = JOptionPane.showInputDialog("¿Cuál es tu dirección?");
		String Hobby = JOptionPane.showInputDialog("Cuál es tu Hobby?");
		String Height = JOptionPane.showInputDialog("Cual es tu estatura?");
		String Weight = JOptionPane.showInputDialog("Cual es tu peso?");
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		JOptionPane.showMessageDialog(null, person.toString());
	}
}

