package seminar04.task04;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

class EmailServiceTest {

    @Test
    void testSendWelcomeEmail() {
        // Создаем шпиона для сервиса отправки email
        EmailService emailService = spy(new EmailService());

        // Вызываем метод регистрации пользователя
        UserService userService = new UserService(emailService);
        userService.registerUser("user@example.com");

        // Проверяем, что метод sendEmail был вызван с определенными аргументами
        verify(emailService).sendEmail("user@example.com", "Добро пожаловать!", "Добро пожаловать в наше приложение!");
    }

    @Test
    void sendEmail() {
    }
}