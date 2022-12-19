package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        int[][] massiveMassive = new int[3][5];
        Random random = new Random();


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                massiveMassive[i][j] = random.nextInt(10);
                System.out.print(massiveMassive[i][j] + " ");


            }
            System.out.println();
        }
        int[][] massiveMassive2 = new int[5][3];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                massiveMassive2[i][j] = massiveMassive[j][i];
                System.out.print(massiveMassive2[i][j] + " ");


            }
            System.out.println();
        }
    }
}
