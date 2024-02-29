package edu.arep.funciones;

public class Palindrome implements Calculator {

    @Override
    public double calculate(double[] values) {
        if (values.length != 1) {
            throw new IllegalArgumentException("Palindromo necesita exactamente un valor para calcular.");
        }
        String str = String.valueOf(values[0]);
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        return str.equals(reversed) ? 1 : 0;
    }
}

