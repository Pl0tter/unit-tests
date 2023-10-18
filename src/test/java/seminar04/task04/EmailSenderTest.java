package seminar04.task04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;

class EmailSenderTest {
    @Mock
    private EmailService mockEmailService;

    @BeforeEach
    void setUp() {
        // Инициализируем моки
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSendWelcomeEmail() {
        // Создаем экземпляр EmailSender с моком EmailService
        EmailSender emailSender = new EmailSender(mockEmailService);

        // Вызываем метод, который мы хотим протестировать
        emailSender.sendWelcomeEmail("user@example.com");

        // Проверяем, что метод sendEmail был вызван с ожидаемыми аргументами
        verify(mockEmailService).sendEmail("user@example.com", "Добро пожаловать!", "Добро пожаловать в наше приложение!");
        verify(mockEmailService).sendEmail(eq("user@example.com"), any(), any());
    }

    @Test
    void sendWelcomeEmail() {
    }
}