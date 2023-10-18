package seminar05.task02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserServiceTest {
    private UserService userService;

    // В этом методе можно подготовить окружение, например, создать экземпляр UserRepository.
    @BeforeEach
    void setUp() {
        UserRepository userRepository = new UserRepository();
        userService = new UserService(userRepository);
    }

    // Теперь напишем интеграционный тест для UserService, который будет использовать UserRepository.
    @Test
    void testGetUserById() {
        // Предположим, что у нас есть база данных с пользователем ID 1 и именем "John Doe".
        int userId = 1;
        User user = userService.getUserById(userId);

        // Проверяем, что полученный пользователь совпадает с ожидаемым.
        assertEquals(userId, user.getId());
        assertEquals("John Doe", user.getName());
    }
}