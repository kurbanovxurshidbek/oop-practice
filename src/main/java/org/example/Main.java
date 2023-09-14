package org.example;

import org.example.highlevel.Calculator;
import org.example.highlevel.operators.PositiveNumber;
import org.example.lowlevel.Utils;

public class Main {
    public static void main(String[] args) {
        var num1 = 12;
        var num2 =13;
        var operator = "+";

        int result1 = Utils.calculate(num1, operator, num2);
        System.out.println("Result1 "+result1);

        int result2 = Calculator.calculate(new PositiveNumber(num1),operator,new PositiveNumber(num2));
        System.out.println("Result2 "+result2);
    }
}