package TMS13;

public class Zadacha1 {

    static class WrongLoginException extends Exception {
        public WrongLoginException(String message) {
            super(message);
        }
    }

    static class WrongPasswordException extends Exception {
        public WrongPasswordException(String message) {
            super(message);
        }
    }

    public static boolean test(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        // String login = "Winter_Whale";
        // String password ="Qwerty123";
        // String confirmPassword ="Qwerty123";

        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Логин должен быть меньше 20 символов и не содержать пробелов");
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов, содержать хотя бы 1 цифру и не содержать пробелов");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }

        return true;

    }


    public static void main(String[] args) {
        try {
            boolean result = test("Winter_Whale", "password123", "password123");
            System.out.println("Результат: " + result);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

