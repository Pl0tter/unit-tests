package seminar06;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCalculationTest {
    private static ListCalculation listCalculation;

    @BeforeAll
    static void setup() {
        listCalculation = new ListCalculation();
    }

    @Test
    void sumFinder() {
        //Подготовка
        List<Integer> testList = new ArrayList<>(Arrays.asList(-2, -1, 0, 1, 2));

        //Проверка на сумму
        assertEquals(0, listCalculation.sumFinder(testList));
    }

    @Test
    void meanFinder() {
        //Подготовка
        List<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        //Проверка на среднее
        assertEquals(3, listCalculation.meanFinder(testList));
    }
}