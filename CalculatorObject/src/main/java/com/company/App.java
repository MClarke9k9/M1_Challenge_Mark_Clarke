package com.company;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int intAdd = calculator.addInt(1, 1);
        System.out.println("1 + 1 = " + intAdd);
        int intSubtract = calculator.subtractInt(23, 52);
        System.out.println("23 - 52 = " + intSubtract);
        int intMultiply = calculator.multiplyInt(34, 2);
        System.out.println("34 * 2 = " + intMultiply);
        int intDivide = calculator.divideInt(12, 3);
        System.out.println("12 / 3 = " + intDivide);
        double intDivide2 = calculator.divideDouble(12.0D, 7.0D);
        System.out.println("12 / 7 = " + intDivide2);
        double doubleAdd = calculator.addDouble(3.4D, 2.3D);
        System.out.println("3.4 + 2.3 = " + doubleAdd);
        double doubleMultiply = calculator.multiplyDouble(6.7D, 4.4D);
        System.out.println("6.7 * 4.4 = " + doubleMultiply);
        double doubleSubtract = calculator.subtractDouble(5.5D, 0.5D);
        System.out.println("5.5 - 0.5 = " + doubleSubtract);
        double doubleDivide = calculator.divideDouble(10.8D, 2.2D);
        System.out.println("10.8 / 2.2 = " + doubleDivide);
    }
}
