package edu.arep.funciones;

public class Sin implements Calculator {
    @Override
    public double calculate(double[] values) {
        if (values.length != 1) {
            throw new IllegalArgumentException("Sin necesita exactamente un valor para calcular.");
        }
        return Math.sin(Math.toRadians(values[0]));
    }
}

