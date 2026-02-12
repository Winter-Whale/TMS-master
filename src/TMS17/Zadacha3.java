package TMS17;

import java.util.function.Function;

public class Zadacha3 {
    public static void main(String[] args) {
        Function<String, Double> currency = (str) -> {
            try {
                String[] part = str.split(" ");
                if (part.length != 2 || !part[1].equalsIgnoreCase("BYN")) {
                    throw new IllegalArgumentException("Неверный формат ввода");
                }
                double byn = Double.parseDouble(part[0]);
                return byn * 0.36;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Некорректное число", e);
            }
        };

        System.out.println(currency.apply("1500 BYN"));
    }
}
