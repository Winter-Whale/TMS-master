package TMS18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Zadacha1 {
    public  static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(10, 7, 9, 43,2,20,10,20,34,8,6,6,9,15,43 ));
        Stream <Integer>stream = numbers.stream();
        System.out.println("Сумма всех четных элементов без дубликатов:");
        stream.filter(x-> x % 2 == 0).distinct().reduce(Integer::sum).ifPresent(System.out::println);
    }
}
