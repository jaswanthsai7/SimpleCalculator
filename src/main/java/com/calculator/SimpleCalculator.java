/*
 * Author Name : Jaswanth Sai
 * Date : 9/4/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.calculator;

public class SimpleCalculator{
    private double firstNumber;
    private double secondNumber;

    public SimpleCalculator() {
    }

    public SimpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "SimpleCalculator{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }
}
