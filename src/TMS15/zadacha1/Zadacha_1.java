package TMS15.zadacha1;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Zadacha_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа через запятую: ");
        String input = scanner.nextLine();

        String[] numbersArray = input.split("\\s*,\\s*");

        Set<String> uniqueNumbers = new LinkedHashSet<>();

        Collections.addAll(uniqueNumbers, numbersArray);

        String result = String.join(", ", uniqueNumbers);

        System.out.println("Результат без дубликатов: " + result);
    }
}
