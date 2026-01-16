package TMS4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Введите размер массива до 10");
        Scanner scanner = new Scanner(System.in);
        int array = scanner.nextInt();
        int[] mass = new int[array];
        for (int i = 0; i < array; i++) {
            mass[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length / 2; i++) {
            int temp = mass[i];
            mass[i] = mass[mass.length - 1 - i];
            mass[mass.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(mass));
    }
}
