package TMS11;


import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = new String[3];
        System.out.println("Введите 3 строки");
        for (int i = 0; i < 3; i++) {
            stringArray[i] = scanner.nextLine();
        }
        String oneword = null;
        for (String array : stringArray) {
            String[] words = array.split(" ");
            for (String word : words) {
                if (hasAllUniqueChars(word)) {
                    oneword = word;
                    break;
                }
            }

            if (oneword != null) {
                break;
            }
        }

        if (oneword != null) {
            System.out.println("Уникальное слово: " + oneword);
        }
    }

    private static boolean hasAllUniqueChars(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }

        boolean[] seen = new boolean[Character.MAX_VALUE];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (seen[ch]) {
                return false;
            }
            seen[ch] = true;
        }
        return true;

    }
}

