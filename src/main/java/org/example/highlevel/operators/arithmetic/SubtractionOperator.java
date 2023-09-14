package org.example.highlevel.operators.arithmetic;

import org.example.highlevel.operators.SupportOperator;
import org.example.highlevel.operators.PositiveNumber;

public class SubtractionOperator implements SupportOperator {

    @Override
    public boolean supports(String operator) {
        return "-".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toInt() - operand2.toInt();
    }
}
