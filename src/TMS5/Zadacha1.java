package TMS5;

import java.util.Random;
import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите добавочное число");
        int[][] reg = new int[4][3];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                reg[i][j] = random.nextInt(20);
            }
        }
        int vvod = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                reg[i][j] += vvod;
                sum += reg[i][j];
            }
        }
        System.out.println(sum);
    }
}
