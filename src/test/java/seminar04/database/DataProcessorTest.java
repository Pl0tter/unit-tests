package seminar04.database;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class DataProcessorTest {
    @Test
    public void testProcessData() {
        // Создаем мок для Database
        Database database = mock(Database.class);

        // Настраиваем его поведение
        when(database.query(anyString())).thenReturn(Arrays.asList("First", "Second", "Third"));

        // Создаем объект класса, который мы хотим протестировать, передавая мок в качестве зависимости
        DataProcessor dataProcessor = new DataProcessor(database);

        // Вызываем метод, который хотим протестировать
        List<String> resultSize = dataProcessor.processData("SELECT * FROM table");

        // Проверяем результат
        assertEquals(3, resultSize.size());
    }
}