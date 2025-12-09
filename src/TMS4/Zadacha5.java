package TMS4;

import java.util.Arrays;

public class Zadacha5 {
    public static void main(String[] args){
        int[] mass = {5, 16, 1, 66};
        System.out.println(Arrays.toString(mass));
        int a= mass[0];
        mass[0]=mass[3];
        mass[3]=a;
        int b = mass[1];
        mass[1]=mass[2];
        mass[2]=b;
        System.out.println(Arrays.toString(mass));
    }
}
