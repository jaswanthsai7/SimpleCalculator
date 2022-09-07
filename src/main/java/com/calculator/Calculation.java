/*
 * Author Name : Jaswanth Sai
 * Date : 9/7/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.calculator;

public class Calculation extends SimpleCalculator {
    public Calculation() {
    }

    public Calculation(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    public double add(double firstNumber, double secondNumber) {
        double sum = 0;
        try {

            sum = firstNumber + secondNumber;
        } catch (ArithmeticException exception) {
            exception.getMessage();
        }
        return sum;
    }
}
