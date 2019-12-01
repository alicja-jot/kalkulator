package com.kodilla.kalkulator;

public class Calculator {
    double result = 0;

    public double add(double x, double y) {
        result = x + y;
        System.out.println("Wynik dodawania to: " + result);
        return result;
    }

    public double subtract (double x, double y) {
        result = x - y;
        System.out.println("Wynik odejmowania to: " + result);
        return result;
    }
}
