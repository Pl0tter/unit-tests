package seminar03.task01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorViewTest {
    public static CalculatorView view;

    @BeforeAll
    public static void createView() {
        view = new CalculatorView();
    }

    @Test
    void printMenu() {
        // Проверяем, что метод printMenu() выводит текст меню.
        // Создаём объект ByteArrayOutputStream, чтобы перехватить вывод
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printMenu();

        // Проверяем, что вывод соответствует ожидаемому тексту меню
        assertEquals("Выберите операцию:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление\n5. Выход\n", outContent.toString());

        // Восстанавливаем стандартный поток вывода
        System.setOut(System.out);
    }

    @Test
    void printResult() {
        int result = 10;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        view.printResult(result);
        assertEquals("Результат: " + result + "\r\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    void getInput() {
        ByteArrayInputStream in = new ByteArrayInputStream("42\n".getBytes());
        System.setIn(in);
        assertEquals(42, view.getInput(), "Не принимает числа!");
        System.setIn(System.in);
    }

    @Test
    void printErrorMessage() {
        String message = "Test";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        view.printErrorMessage(message);
        assertEquals(message + "\r\n", outContent.toString());
        System.setOut(System.out);
    }
}