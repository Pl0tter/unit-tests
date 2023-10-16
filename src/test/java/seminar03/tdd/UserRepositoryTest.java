package seminar03.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    static UserRepository repo;

    @BeforeAll
    static void setup() {
        repo = new UserRepository();
    }

    @Test
    void deauthentificate() {
        User admin = new User("Admin", "admin", true);
        User anna = new User("Anna", "anna", false);
        User petr = new User("Petr", "petr", false);
        admin.authenticate("Admin", "admin");
        anna.authenticate("Anna", "anna");
        petr.authenticate("Petr", "petr");
        repo.addUser(admin);
        repo.addUser(anna);
        repo.addUser(petr);

        repo.deauthentificate();

        assertTrue(repo.findByName("Admin"));
        assertFalse(repo.findByName("Anna"));
        assertFalse(repo.findByName("Petr"));
    }
}