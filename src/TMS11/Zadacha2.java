package TMS11;

import java.util.Arrays;
import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = new String[3];
        System.out.println("Введите 3 строки");
        for (int i = 0; i < 3; i++) {
            stringArray[i] = scanner.nextLine();
        }

        Arrays.sort(stringArray, (s1, s2) -> s1.length() - s2.length());

        for (String s : stringArray) {
            System.out.println(s);
        }
    }
}
