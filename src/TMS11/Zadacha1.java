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


        String minString = stringArray[0];
        String maxString = stringArray[0];
        for (int i = 1; i < stringArray.length; i++) {
            if (stringArray[i].length() < minString.length()) {
                minString = stringArray[i];
            }
            if (stringArray[i].length() > maxString.length()) {
                maxString = stringArray[i];
            }
        }


        System.out.println("Минимальная строка = " + minString + ", ее длина = " + minString.length());
        System.out.println("Максимальная строка = " + maxString + ", ее длина = " + maxString.length());
    }
}
