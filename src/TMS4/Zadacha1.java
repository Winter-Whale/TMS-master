package TMS4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadacha1 {

    public static void main(String[] args) {

        System.out.println("Введите размер массива");

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] mass = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(11);

        }

        System.out.println(Arrays.toString(mass));

        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i]);
            if (i > 0) {
                System.out.print(" ,");
            }
        }
    }

}
