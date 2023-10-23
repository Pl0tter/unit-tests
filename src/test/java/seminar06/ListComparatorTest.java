package seminar06;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;

class ListComparatorTest {

    @Test
    void meanCompare() {
        //Подготовка
        List<Integer> listFirst = mock(List.class);
        List<Integer> listSecond = mock(List.class);
        ListCalculation mockListCalculation = mock(ListCalculation.class);
        ListComparator listComparator = new ListComparator(mockListCalculation);

        //Проверка условия больше
        when(mockListCalculation.meanFinder(listFirst)).thenReturn(7.0);
        when(mockListCalculation.meanFinder(listSecond)).thenReturn(6.0);
        assertEquals("Первый список имеет большее среднее значение", listComparator.meanCompare(listFirst, listSecond));

        //Проверка условия меньше
        when(mockListCalculation.meanFinder(listFirst)).thenReturn(6.0);
        when(mockListCalculation.meanFinder(listSecond)).thenReturn(7.0);
        assertEquals("Второй список имеет большее среднее значение", listComparator.meanCompare(listFirst, listSecond));

        //Проверка условия равенства
        when(mockListCalculation.meanFinder(listFirst)).thenReturn(6.0);
        when(mockListCalculation.meanFinder(listSecond)).thenReturn(6.0);
        assertEquals("Средние значения равны", listComparator.meanCompare(listFirst, listSecond));

        //Проверка вызова методов
        verify(mockListCalculation, times(3)).meanFinder(listFirst);
        verify(mockListCalculation, times(3)).meanFinder(listSecond);
    }
}