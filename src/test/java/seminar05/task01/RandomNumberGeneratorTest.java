package seminar05.task01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    @Test
    void testRandomNumberGenerator() {
        //Проверка на правильное количество чисел
        RandomNumberGenerator generator = new RandomNumberGenerator();
        List<Integer> randomNumbers = generator.randomNumberGenerator(5);
        assertEquals(5, randomNumbers.size());
        //Проверка на диапазон
        for (int num : randomNumbers) {
            assertTrue(num >= 1 && num <= 100);
        }
    }
}