package seminar05.task01;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {
    @Test
    void testIntegration() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        MaxNumberFinder finder = new MaxNumberFinder();

        // Генерация случайного списка чисел
        List<Integer> randomNumbers = generator.randomNumberGenerator(10);

        // Поиск максимального числа
        int maxNumber = finder.findMaxNumber(randomNumbers);

        // Проверка на правильность
        assertEquals(maxNumber, Collections.max(randomNumbers));
    }
}
