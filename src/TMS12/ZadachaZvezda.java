package TMS12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZadachaZvezda {
    public static void main(String[] args){
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?<tel>\\+\\(\\d{2}\\)\\d{7})" +
                "(?<doc>\\d{4}-\\d{4}-\\d{2})" +
                "(?<email>[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})"
        );
        Matcher matcher = pattern.matcher(line);

        if(matcher.find()) {
            System.out.println("Номер документа: " + matcher.group("doc"));
            System.out.println("Почта: "+ matcher.group("email"));
           System.out.println("Номер телефона: "+ matcher.group("tel"));
        }
    }
}
