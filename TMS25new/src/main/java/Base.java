import java.util.HashMap;

public class Base {
    private static HashMap<String, User> base = new HashMap<>();

    static {
        base.put("ivan", new User("ivan", "ivan1", "admin"));
        base.put("gleb", new User("gleb", "gleb2", "user"));
        base.put("pavel", new User("pavel", "pavel3", "user"));
    }

    public static User searche(String login, String password) {
        User user = base.get(login);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
