package seminar03.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.isAuthenticate) {
            data.add(user);
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Задание 3.* Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей,
     * кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством,
     * указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.
     */
    public void deauthentificate() {
        int index = 0;
        while (index < data.size()) {
            if (data.get(index).isAuthenticate && !data.get(index).isAdmin) {
                data.get(index).isAuthenticate = false;
                data.remove(index);
            } else {
                index += 1;
            }
        }
    }
}