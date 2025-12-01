package TMS5;

import java.util.Scanner;

public class ZadachaZvezda {
    public static void main(String[] args) {
        System.out.println("Введите размер двумерного массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int counter = 1;
        int[][] field = new int[n][m];
        for (int a = 0; a < n; a++) {
            if ( a % 2 == 0) {
                for (int c = 0; c < m; c++) {
                    field[a][c] = counter++;
                }
            } else {
                for (int c = m - 1; c >= 0; c--) {
                    field[a][c] = counter++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", field[i][j]);
            }
            System.out.println();
        }
    }
}
