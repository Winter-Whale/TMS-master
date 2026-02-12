package TMS17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Zadacha2 {
    public static void main(String[] args) {
        int[] numbers = {-10, 5, 15, -1, 0, 7, 20};
        Predicate<Integer> result = x -> x >= 0;
        List<Integer> numbersNew = new ArrayList<>();
        for (Integer number : numbers) {
            if (result.test(number)) {
                numbersNew.add(number);
            }
        }
        System.out.println("Четные числа: " + numbersNew);
    }
}
