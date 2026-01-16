package TMS11;

import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = new String[3];
        System.out.println("Введите 3 строки");
        for (int i = 0; i < 3; i++) {
            stringArray[i] = scanner.nextLine();
        }
        int size = 0;
        for (int i = 0; i < stringArray.length; i++) {
            size += stringArray[i].length();
        }
        int average = size / 3;
        for (int i = 0; i < 3; i++) {
            if (stringArray[i].length() < average) {
                System.out.println(stringArray[i] + " ,длина строки = " + stringArray[i].length());
            }
        }
    }
}
