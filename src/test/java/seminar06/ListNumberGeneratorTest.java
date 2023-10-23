package seminar06;

import org.junit.jupiter.api.Test;
import seminar06.ListNumberGenerator;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListNumberGeneratorTest {

    @Test
    void randomNumberGenerator() {
        //Подготовка
        int size = 10;
        int min = 0;
        int max = 1;
        ListNumberGenerator generator = new ListNumberGenerator();
        List<Integer> randomNumbers = generator.randomNumberGenerator(size, min, max);

        //Проверка на правильное количество чисел
        assertEquals(size, randomNumbers.size());

        //Проверка на диапазон
        for (int num : randomNumbers) {
            assertTrue(num >= min && num <= max);
        }
    }
}