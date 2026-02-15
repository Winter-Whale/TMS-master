package TMS20;

import java.util.Scanner;


class Max implements Runnable {
    private int[] array;
    private int max;

    public Max(int[] array) {
        this.array = array;
        this.max = Integer.MIN_VALUE;
    }

    @Override
    public void run() {
        max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
    }

    public int getMax() {
        return max;
    }
}

class Min implements Runnable {
    private int[] array;
    private int min;

    public Min(int[] array) {
        this.array = array;
        this.min = Integer.MAX_VALUE;
    }

    @Override
    public void run() {
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
    }

    public int getMin() {
        return min;
    }
}


public class Zadacha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Min minTask = new Min(array);
        Max maxTask = new Max(array);

        Thread thread1 = new Thread(maxTask);
        Thread thread2 = new Thread(minTask);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        int min = minTask.getMin();
        int max = maxTask.getMax();

        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);


    }
}
