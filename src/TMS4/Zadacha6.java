package TMS4;

import java.util.Arrays;

public class Zadacha6 {
    public static void main(String[] args) {
        int[] mass = {5, 16, 19, 66};
        System.out.println(Arrays.toString(mass));
        if (Result(mass) == true) {
            System.out.println("Массив является возрастающим");
        } else {
            System.out.println("Массив не является возрастающим");
        }
    }

    public static boolean Result(int[] mass) {
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] <= mass[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
