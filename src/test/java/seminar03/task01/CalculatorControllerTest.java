package seminar03.task01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    private CalculatorController controller;
    private CalculatorModel model;
    private CalculatorView view;

    @BeforeEach
    public void setUp() {
        model = new CalculatorModel(); // Простой стаб для CalculatorModel
        view = new CalculatorView(); // Простой стаб для CalculatorView
        controller = new CalculatorController(model, view);
    }

    @Test
    public void testPerformOperationWithArithmeticException() {
        // Устанавливаем ввод пользователя: первое число = 5, второе число = 0
        System.setIn(new ByteArrayInputStream("4\n5\n0\n".getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        controller.run();

        // Проверяем, что было вызвано сообщение об ошибке с правильным сообщением
        assertTrue(outContent.toString().contains("Ошибка: деление на ноль"));

        // Восстанавливаем стандартный поток вывода и ввода
        System.setIn(System.in);
        System.setOut(System.out);
    }
}