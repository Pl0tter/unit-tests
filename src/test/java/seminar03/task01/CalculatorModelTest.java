package seminar03.task01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorModelTest {
    public static CalculatorModel calculator;

    @BeforeAll
    public static void createCalculator() {
        calculator = new CalculatorModel();
    }

    @Test
    void getFirstNumber() {
        int expectedNumber = 3;
        calculator.setFirstNumber(expectedNumber);
        assertEquals(expectedNumber, calculator.getFirstNumber(), "Метод getFirstNumber некорректен");
    }

    @Test
    void setFirstNumber() {
        int expectedNumber = 4;
        calculator.setFirstNumber(expectedNumber);
        assertEquals(expectedNumber, calculator.getFirstNumber(), "Метод setFirstNumber некорректен");
    }

    @Test
    void getSecondNumber() {
        int expectedNumber = 5;
        calculator.setSecondNumber(expectedNumber);
        assertEquals(expectedNumber, calculator.getSecondNumber(), "Метод getSecondNumber некорректен");
    }

    @Test
    void setSecondNumber() {
        int expectedNumber = 6;
        calculator.setSecondNumber(expectedNumber);
        assertEquals(expectedNumber, calculator.getSecondNumber(), "Метод setSecondNumber некорректен");
    }

    @Test
    void add() {
        int expectedSum = 10;
        calculator.setFirstNumber(2);
        calculator.setSecondNumber(8);
        assertEquals(expectedSum, calculator.add(), "Метод sum не корректен");
    }

    @Test
    void subtract() {
        int expectedResult = 10;
        calculator.setFirstNumber(100);
        calculator.setSecondNumber(90);
        assertEquals(expectedResult, calculator.subtract(), "Метод substract не корректен");
    }

    @Test
    void multiply() {
        int expectedResult = 10;
        calculator.setFirstNumber(2);
        calculator.setSecondNumber(5);
        assertEquals(expectedResult, calculator.multiply(), "Метод multiply не корректен");
    }

    @Test
    void divide() {
        int expectedResult = 20;
        calculator.setFirstNumber(80);
        calculator.setSecondNumber(4);
        assertEquals(expectedResult, calculator.divide(), "Метод divide не корректен");
    }

    @Test
    void divideByZero() {
        calculator.setFirstNumber(2);
        calculator.setSecondNumber(0);
        assertThrows(ArithmeticException.class, () -> calculator.divide(), "Не отрабатывает исключение!");
    }
}