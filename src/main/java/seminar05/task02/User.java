package seminar05.task02;

public class User {
    private int id;
    private String name;

    public User(int userId, String name) {
        this.id = userId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
