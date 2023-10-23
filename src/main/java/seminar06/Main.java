package seminar06;

import java.util.List;

public class Main {
    /**
     * Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
     * a. Рассчитывает среднее значение каждого списка.
     * b. Сравнивает эти средние значения и выводит соответствующее сообщение:
     * - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
     * - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
     * - ""Средние значения равны"", если средние значения списков равны.
     * <p>
     * Важно:
     * Приложение должно быть написано в соответствии с принципами объектно-ориентированного программирования.
     * Используйте Pytest (для Python) или JUnit (для Java) для написания тестов, которые проверяют правильность работы программы. Тесты должны учитывать различные сценарии использования вашего приложения.
     * Используйте pylint (для Python) или Checkstyle (для Java) для проверки качества кода.
     * * запуск CheckStyle с параметрами -c /sun_checks.xml ./src/main/java/seminar06/ -o ./out/checkstyle.txt
     * Сгенерируйте отчет о покрытии кода тестами. Ваша цель - достичь минимум 90% покрытия.
     */
    public static void main(String[] args) {
        ListNumberGenerator generator = new ListNumberGenerator();
        ListCalculation calculation = new ListCalculation();
        ListComparator comparator = new ListComparator();

        List<Integer> listFirst = generator.randomNumberGenerator(10, 0, 9);
        List<Integer> listSecond = generator.randomNumberGenerator(10, 0, 9);

        System.out.println(listFirst);
        System.out.println("Среднее значение: " + calculation.meanFinder(listFirst));
        System.out.println(listSecond);
        System.out.println("Среднее значение: " + calculation.meanFinder(listSecond));
        System.out.println(comparator.meanCompare(listFirst, listSecond));
    }
}
