package TMS4;

import java.util.Arrays;
import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива от 0 до 10");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mass = new int[size];

        System.out.println("Введите элементы массива");

        for (int a = 0; a < size; a++) {
            mass[a] = scanner.nextInt();
        }
        int number=0;
        for(int i = 0; i<mass.length; i++){
            if (mass[i] == 0){
                number++;
            }
        }

        System.out.println(Arrays.toString(mass));
        if(number>0){
            System.out.println("Количество нулевых элементов "+number);
        }
        else{
            System.out.println("Нулевых элементов нет");
        }

    }
}
