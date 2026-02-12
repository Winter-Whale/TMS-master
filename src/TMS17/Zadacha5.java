package TMS17;

import java.util.Scanner;
import java.util.function.Supplier;

public class Zadacha5 {
    public static void main(String[] args) {
        System.out.println("Введите фразу");
        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String result = new StringBuilder(input).reverse().toString();
            return  result;
        };
        System.out.println(supplier.get());
    }

}
