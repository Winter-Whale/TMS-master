package TMS11;

import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = new String[3];
        System.out.println("Введите 3 строки");
        for (int i = 0; i < 3; i++) {
            stringArray[i] = scanner.nextLine();
        }


        int minSize = stringArray[0].length();
        String minString = stringArray[0];
        for (int i = 1; i < stringArray.length; i++) {
            if (stringArray[i].length() < minSize) {
                minString = stringArray[i];
                minSize = stringArray[i].length();
            }
        }

        int maxSize = stringArray[0].length();
        String maxString = stringArray[0];
        for (int i = 1; i < stringArray.length; i++) {
            if (stringArray[i].length() > maxSize) {
                maxString = stringArray[i];
                maxSize = stringArray[i].length();
            }
        }

        System.out.println("Минимальная строка = " + minString + ", ее длина = " + minSize);
        System.out.println("Максимальная строка = " + maxString + ", ее длина = " + maxSize);
    }
}
