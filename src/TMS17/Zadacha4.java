package TMS17;

import java.util.function.Consumer;

public class Zadacha4 {
    public static void main(String[] args) {
        Consumer<String> currency = str -> {
            String[] part = str.split(" ");
            double byn = Double.parseDouble(part[0]);
            double usd = byn * 0.36;
            System.out.printf("%.2f BYN = %.2f USD", byn, usd);
        };
        currency.accept("1500 BYN");
    }
}
