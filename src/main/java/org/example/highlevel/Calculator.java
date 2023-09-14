package org.example.highlevel;

import org.example.highlevel.operators.*;
import org.example.highlevel.operators.arithmetic.AdditionOperator;
import org.example.highlevel.operators.arithmetic.DivisionOperator;
import org.example.highlevel.operators.arithmetic.MultiplicationOperator;
import org.example.highlevel.operators.arithmetic.SubtractionOperator;

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
