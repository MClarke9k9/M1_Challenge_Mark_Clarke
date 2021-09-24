package com.company;

public class Calculator {
    private int a;
    private int b;
    private double dA;
    private double dB;

    public Calculator() {
    }

    public int addInt(int a, int b) {
        return a + b;
    }

    public int subtractInt(int a, int b) {
        return a - b;
    }

    public int multiplyInt(int a, int b) {
        return a * b;
    }

    public int divideInt(int a, int b) {
        return a / b;
    }

    public double addDouble(double dA, double dB) {
        return dA + dB;
    }

    public double subtractDouble(double dA, double dB) {
        return dA - dB;
    }

    public double multiplyDouble(double dA, double dB) {
        return dA * dB;
    }

    public double divideDouble(double dA, double dB) {
        return dA / dB;
    }
}
