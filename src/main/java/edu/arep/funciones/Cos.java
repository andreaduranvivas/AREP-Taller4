package edu.arep.funciones;

public class Cos implements Calculator {
    @Override
    public double calculate(double[] values) {
        if (values.length != 1) {
            throw new IllegalArgumentException("Cos necesita exactamente un valor para calcular.");
        }
        return Math.cos(Math.toRadians(values[0]));
    }
}
