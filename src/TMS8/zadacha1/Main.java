package TMS8.zadacha1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    Terapevt terapevt = new Terapevt();
    Hirurg hirurg = new Hirurg();
    Dantist dantist = new Dantist();
    Patient patient = new Patient();
    void main(String[] args){
        System.out.println("Укажите жалобу: "+patient.getPlan1()+", "+patient.getPlan2()+", "+patient.getPlan3());
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if( a == 1){
            System.out.println("Доктор: "+terapevt.name+" назначил врача: "+terapevt.name);
            System.out.println("Врач "+terapevt.name+" "+terapevt.treatment());
        }else if (a == 2){
            System.out.println("Доктор: "+terapevt.name+" назначил врача: "+hirurg.name);
            System.out.println("Врач "+hirurg.name+" "+hirurg.treatment());
        } else if (a == 3){
            System.out.println("Доктор: "+terapevt.name+" назначил врача: "+dantist.name);
            System.out.println("Врач "+dantist.name+" "+dantist.treatment());
        }
        System.out.println("Хорошего дня! Приходите к нам еще");
    }

}