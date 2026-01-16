package TMS10;

public class Test {
    public static void main(String[] args) {
        System.out.println("=== Создание пользователей с одинаковыми данными ===\n");

        User user1 = new User(1, "john_doe", "john@example.com");
        User user2 = new User(1, "john_doe", "john@example.com");
        User user3 = new User(2, "jane_smith", "jane@example.com");
        User user4 = new User(1, "john_doe", "john@example.com");

        System.out.println("User1: " + user1.toString());
        System.out.println("User2: " + user2.toString());
        System.out.println("User3: " + user3.toString());
        System.out.println("User4: " + user4.toString());
        System.out.println();

        System.out.println("user1.equals(user2): " + user1.equals(user2));
        System.out.println("Ожидается: true (одинаковые поля)");
        System.out.println();

        System.out.println("user1.equals(user3): " + user1.equals(user3));
        System.out.println("Ожидается: false (разные данные)");
        System.out.println();

        System.out.println("user1.equals(user4): " + user1.equals(user4));
        System.out.println("Ожидается: true (одинаковые поля)");
        System.out.println();

        System.out.println("user2.equals(user4): " + user2.equals(user4));
        System.out.println("Ожидается: true (одинаковые поля)");
        System.out.println();
    }
}
