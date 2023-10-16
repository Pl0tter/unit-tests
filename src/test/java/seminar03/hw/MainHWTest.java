package seminar03.hw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
    static MainHW main;

    @BeforeAll
    static void setup() {
        main = new MainHW();
    }

    @Test
    void evenOddNumber() {
        assertTrue(main.evenOddNumber(2),
                "Метод evenOddNumber не корректно отрабатывает четные числа");
        assertFalse(main.evenOddNumber(3),
                "Метод evenOddNumber не корректно отрабатывает не четные числа");
    }

    @Test
    void numberInInterval() {
        assertTrue(main.numberInInterval(50),
                "Метод numberInInterval не корректно отрабатывает числа в интервале");
        assertFalse(main.numberInInterval(1000),
                "Метод numberInInterval не корректно отрабатывает числа не в интервале");
        assertFalse(main.numberInInterval(25),
                "Метод numberInInterval не корректно отрабатывает границы интервала");
        assertFalse(main.numberInInterval(100),
                "Метод numberInInterval не корректно отрабатывает границы интервала");
    }
}