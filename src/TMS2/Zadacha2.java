package TMS2;

import java.util.Scanner;

public class Zadacha2 {

    public static void main(String[] args){

        System.out.println("Введите температуру");

        Scanner temp = new Scanner(System.in);
        int t = temp.nextInt();
        if (t>-5){
            System.out.println("Warm");
        } if(t<-20) {
            System.out.println("Cold");
        } if((-5>=t&t>-20)){
            System.out.println("Normal");
        }

    }
}
