package TMS17;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        System.out.println("Введите дату своего рождения в формате ГГГГ-ММ-ДД (например, 2023-10-25):");
        try {
            Scanner s = new Scanner(System.in);
            String age = s.nextLine();
            LocalDate ageNew = LocalDate.parse(age);
            LocalDate years = ageNew.plusYears(100);
            System.out.println("Вам будет 100 лет в " + years + "\nЭто будет " + years.getDayOfWeek());
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты");
        }

    }
}
