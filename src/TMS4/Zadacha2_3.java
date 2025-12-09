package TMS4;

import java.util.Arrays;
import java.util.Scanner;

public class Zadacha2_3 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива от 0 до 10");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mass = new int[size];

        System.out.println("Введите элементы массива");

        for (int a = 0; a < size; a++) {
            mass[a] = scanner.nextInt();
        }

        int min = mass[0];
        int max = mass[0];

        for (int i = 1; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        int minIndex = 0;
        int minValue = mass[0];
        int maxIndex = 0;
        int maxValue = mass[0];

        for (int b = 1; b < mass.length; b++) {
            if (mass[b] < minValue) {
                minValue = mass[b];
                minIndex = b;
            }
            if (mass[b] > maxValue) {
                maxValue = mass[b];
                maxIndex = b;
            }
        }

        System.out.println(Arrays.toString(mass));
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Индекс максимально элемента " + maxIndex);
        System.out.println("Индекс минимального элемента " + minIndex);
    }
}
