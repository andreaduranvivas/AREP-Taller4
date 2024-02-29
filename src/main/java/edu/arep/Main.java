package edu.arep;

import edu.arep.funciones.*;

public class Main {
    public static void main(String[] args) {
        Calculator sinCalc = new Sin();
        double sinValue = sinCalc.calculate(new double[]{Math.PI / 2});
        System.out.println("Seno de PI/2: " + sinValue);

        Calculator cosCalc = new Cos();
        double cosValue = cosCalc.calculate(new double[]{0});
        System.out.println("Coseno de 0: " + cosValue);

        Calculator magnitudCalc = new Magnitude();
        double magnitudValue = magnitudCalc.calculate(new double[]{3, 4});
        System.out.println("Magnitud de [3, 4]: " + magnitudValue);

        Calculator palindromoCalc = new Palindrome();
        double palindromoValue = palindromoCalc.calculate(new double[]{12321});
        System.out.println("Es palíndromo: " + (palindromoValue == 0)); //0 es si, 1 es no
    }
}

