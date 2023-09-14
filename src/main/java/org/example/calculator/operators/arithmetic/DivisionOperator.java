package org.example.calculator.operators.arithmetic;

import org.example.calculator.operators.SupportOperator;
import org.example.calculator.operators.PositiveNumber;

public class DivisionOperator implements SupportOperator {

    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toInt() / operand2.toInt();
    }
}