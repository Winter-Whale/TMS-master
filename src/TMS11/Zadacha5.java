package TMS11;

import java.util.Scanner;

public class Zadacha5 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        String result = "";
        for (int i = 0; i< str.length();i++){
            char c = str.charAt(i);
            result += c;
            result += c;
        }
        System.out.println(result);
    }
}
