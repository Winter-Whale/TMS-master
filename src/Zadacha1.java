import java.util.Scanner;

public class Zadacha1 {

    static void main(String[] args) {

        System.out.println("Введите любое число");

        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();;
        if (a%2 == 1){
            System.out.println("Число нечетное");
        } else {
            System.out.println("Число четное");
        }

    }
}
