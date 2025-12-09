package TMS5;

public class Zadacha2 {
    public static void main(String[] args) {
        String[][] field = new String[8][8];
        String w = "W";
        String b = "B";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    field[i][j] = w;
                } else {
                    field[i][j] = b;
                }
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }

    }
}
