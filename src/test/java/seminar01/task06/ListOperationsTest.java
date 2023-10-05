package seminar01.task06;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListOperationsTest {
    @Test
    public void sumListShouldBeCorrect() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 6));
        assertEquals(result, ListOperations.sumLists(list1, list2), "Сумма списков не верна!");
        assertThrows(IllegalArgumentException.class, () -> ListOperations.sumLists(list1, Arrays.asList(1, 2)),
                "Не отрабатывает исключение при неравных списках!");
    }

    @Test
    public void findMaxTest() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(-4, 2, 0, 10));
        assertEquals(10, ListOperations.findMax(list1), "Не верный максимальный элемент!");
        assertThrows(IllegalArgumentException.class, () -> ListOperations.findMax(Collections.emptyList()),
                "Не отрабатывает исключение при пустом списке!");
    }

    @Test
    public void filterStringTest() {
        List<String> words = new ArrayList<>(Arrays.asList("I", "love", "Java", "JUnit", "framework"));
        List<String> words_filtered = new ArrayList<>(List.of("framework"));
        assertEquals(words_filtered, ListOperations.filterStrings(words, 6), "Не верный фильтр!");
        assertThrows(IllegalArgumentException.class, () -> ListOperations.filterStrings(words, -1),
                "Не отрабатывает исключение!");
    }
}
