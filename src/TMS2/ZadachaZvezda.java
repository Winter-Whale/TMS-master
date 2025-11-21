package TMS2;

import java.util.Scanner;

public class ZadachaZvezda {

    public static void main(String[] args){

        System.out.println("Введите любое целове положительное число");

        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        if (a<=0){
            System.out.println("Ошибка, число должно быть положительным");
        } else  {
            long sum = 0;
            for (int i=1; i<=a; i++){
                sum+=i;
            }
            System.out.println("Сумма чисел от 1 до "+ a + " = " +sum);

        }

    }
}
