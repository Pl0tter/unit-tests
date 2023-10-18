package seminar05.task02;

/**
 * У вас есть два класса - UserService и UserRepository. UserService использует UserRepository для
 * получения информации о пользователе. Ваша задача - написать интеграционный тест, который
 * проверяет, что UserService и UserRepository работают вместе должным образом.
 */
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(int userId) {
        return userRepository.getUserById(userId);
    }
}
