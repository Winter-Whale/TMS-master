package TMS5;

import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите добавочное число");
        int [][] reg = {{5,3,6}, {1,6,8}};
        int vvod = scanner.nextInt();
        int sum = 0;
        for(int a=0; a<2; a++){
            for(int b=0; b<3;b++){
                reg [a][b] += vvod;
                sum += reg[a][b];
            }
        }
        System.out.println(sum);
    }
}
