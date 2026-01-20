package TMS15.zadacha2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadacha2 {
    public  static void main(String[] args){
        List<String> animals = List.of("Заяц", "Черепаха", "Собака", "Кот");
        List<String> animalsnew = new ArrayList<>(animals);
        System.out.println(animals);
        System.out.println("Введите животное для добавления в список");
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        animalsnew.addFirst(animal);
        animalsnew.removeLast();
        System.out.println(animalsnew);
    }
}
