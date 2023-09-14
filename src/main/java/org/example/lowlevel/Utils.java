package org.example.lowlevel;

public class Utils {
    public static int calculate(int num1, String operator, int num2) {
        switch (operator) {
            case "+":
                return add(num1, num2);
            case "-":
                return subtract(num1, num2);
            case "*":
                return multiply(num1, num2);
            case "/":
                return divide(num1, num2);
            default:
                throw new IllegalArgumentException("Operator topilmadi");
        }
    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }

    private static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
