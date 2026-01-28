package TMS12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZadachaZvezda {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Pattern pattern1 = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Pattern pattern2 = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Pattern pattern3 = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher1 = pattern1.matcher(line);
        Matcher matcher2 = pattern2.matcher(line);
        Matcher matcher3 = pattern3.matcher(line);

        if (matcher1.find()) {
            System.out.println("Номер телефона: " + matcher1.group());
        }
        if (matcher2.find()) {
            System.out.println("Номер документа: " + matcher2.group());
        }
        if (matcher3.find()) {
            System.out.println("Почта: " + matcher3.group());
        }
        scanner.close();

    }
}
