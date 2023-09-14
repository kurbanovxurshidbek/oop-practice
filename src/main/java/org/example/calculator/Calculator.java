package org.example.calculator;

import org.example.calculator.operators.*;
import org.example.calculator.operators.arithmetic.AdditionOperator;
import org.example.calculator.operators.arithmetic.DivisionOperator;
import org.example.calculator.operators.arithmetic.MultiplicationOperator;
import org.example.calculator.operators.arithmetic.SubtractionOperator;

import java.util.List;

public class Calculator {
    private static final List<SupportOperator> SUPPORT_OPERATORS =
            List.of(new AdditionOperator(), new DivisionOperator(),
                    new MultiplicationOperator(), new SubtractionOperator());

    public static int calculate(PositiveNumber num1, String operator, PositiveNumber num2) {
        return SUPPORT_OPERATORS.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(num1, num2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Please provide a correct arithmetic."));
    }

}
