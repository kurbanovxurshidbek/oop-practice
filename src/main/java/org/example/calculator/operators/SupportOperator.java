package org.example.calculator.operators;

public interface SupportOperator {
    boolean supports(String operator);
    int calculate(final PositiveNumber operand1, final PositiveNumber operand2);
}
