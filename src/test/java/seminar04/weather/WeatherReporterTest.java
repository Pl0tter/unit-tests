package seminar04.weather;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class WeatherReporterTest {
    @Test
    public void testWeatherReporter() {
        // Создаем мок для WeatherService
        WeatherService mockWeatherService = mock(WeatherService.class);

        // Определяем поведение мока. Когда метод getCurrentTemperature() будет вызван,
        // он вернет 25
        when(mockWeatherService.getCurrentTemperature()).thenReturn(25);

        // Создаем объект класса WeatherReporter, передаем ему в конструктор наш мок
        WeatherReporter weatherReporter = new WeatherReporter(mockWeatherService);

        // Вызываем метод generateReport()
        String report = weatherReporter.generateReport();

        // Проверяем, что отчет содержит ожидаемую информацию о температуре
        verify(mockWeatherService).getCurrentTemperature();
        assertTrue(report.contains("25"));
    }
}