package org.example;

import org.example.calculator.Calculator;
import org.example.calculator.operators.PositiveNumber;

public class Main {
    public static void main(String[] args) {
        int result = Calculator.calculate(new PositiveNumber(-12),"+",new PositiveNumber(13));
        System.out.println("Result "+result);
    }
}