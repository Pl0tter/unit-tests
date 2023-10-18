package seminar05.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Создайте два модуля. Первый модуль генерирует список случайных чисел. Второй модуль находит
 * максимальное число в этом списке.
 * Вам нужно сначала написать юнит-тесты для каждого модуля, затем написать интеграционный
 * тест, который проверяет, что оба модуля работают вместе правильно
 */
public class RandomNumberGenerator {
    public List<Integer> numbers;
    Random rnd = new Random();

    public List<Integer> randomNumberGenerator(int count) {
        numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(rnd.nextInt(100));
        }
        return numbers;
    }

}
