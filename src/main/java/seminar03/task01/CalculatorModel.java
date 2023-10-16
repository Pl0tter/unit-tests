package seminar03.task01;

public class CalculatorModel {
    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;

    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;

    }

    public int add() {
        return firstNumber + secondNumber;
    }

    public int subtract() {
        return firstNumber - secondNumber;
    }

    public int multiply() {
        return firstNumber * secondNumber;
    }

    public int divide() {
        if (secondNumber == 0) {
            throw new ArithmeticException("деление на 0");
        }
        return firstNumber / secondNumber;
    }
}
