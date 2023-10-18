package seminar04;

import org.junit.jupiter.api.Test;


import java.util.*;

import static org.mockito.Mockito.*;


class MainTest {

    /**
     * 4.0. Проверка работы Mockito
     */
    @Test
    public void simpleTest() {
        // Создаем мок
        List<String> mockedList = mock(List.class);

        // Используем мок
        mockedList.add("one");
        mockedList.clear();

        // Проверяем, что методы были вызваны
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    /**
     * 4.1. Создать мок-объект Iterator, настроить поведение так,
     * чтобы за два вызова next() Iterator вернул два слова “Hello World”,
     * и проверить это поведение с помощью утверждений
     */
    @Test
    public void iteratorWillReturnHelloWorld() {
        // Arrange
        Iterator iteratorMock = mock(Iterator.class);
        when(iteratorMock.next()).thenReturn("Hello World");
        // Act
        assert iteratorMock.next() == "Hello World" : "Итератор вернул не Hello World";
        assert iteratorMock.next() == "Hello World" : "Итератор вернул не Hello World";

        verify(iteratorMock, times(2)).next();
    }
}