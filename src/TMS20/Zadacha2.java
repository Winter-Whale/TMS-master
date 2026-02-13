package TMS20;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

class BubbleSort implements Runnable {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Сортировка пузырьком: " + Arrays.toString(array));
    }
}

class SelectionSort implements Runnable {
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int left = 0; left < array.length; left++) {
            int minInt = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInt]) {
                    minInt = i;
                }
            }
            int temp = array[left];
            array[left] = array[minInt];
            array[minInt] = temp;
        }
        System.out.println("Сортировка выбором: " + Arrays.toString(array));
    }
}

class InsertionSort implements Runnable {
    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;

    }

    @Override
    public void run() {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println("Сортировка вставками: " + Arrays.toString(array));
    }
}

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        SelectionSort selection = new SelectionSort(array);
        InsertionSort insertion = new InsertionSort(array);
        BubbleSort bubble = new BubbleSort(array);

        Thread thread1 = new Thread(selection);
        Thread thread2 = new Thread(insertion);
        Thread thread3 = new Thread(bubble);
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
