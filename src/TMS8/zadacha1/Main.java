package TMS8.zadacha1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Укажите жалобу: 1) Жалоба на стопу, 2) Жалоба на зубы, 3) Жалоба на кашель");
        Scanner scanner = new Scanner(System.in);
        int reason = scanner.nextInt();
        Patient patient = new Patient(reason);

        Terapevt terapevt = new Terapevt();
        terapevt.setDoctor(patient);
        System.out.println(patient.getDoctor().treatment());

        System.out.println("Хорошего дня! Приходите к нам еще");
    }

}