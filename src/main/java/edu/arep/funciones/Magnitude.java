package edu.arep.funciones;

public class Magnitude implements Calculator {
    @Override
    public double calculate(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value * value;
        }
        return Math.sqrt(sum);
    }
}
