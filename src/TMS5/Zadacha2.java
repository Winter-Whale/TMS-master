package TMS5;

public class Zadacha2 {
    public static void main(String[] args) {
        String[][] field = new String[8][8];
        String w= "W";
        String b= "B";

        for (int a = 0; a < 8; a++) {
            for (int c = 0; c < 8; c++) {
                if((a+c) % 2== 0){
                    field[a][c] = w;
                }
                else{
                    field[a][c] = b;
                }
                System.out.print(field[a][c] + " ");
            }
            System.out.println();
        }

    }
}
