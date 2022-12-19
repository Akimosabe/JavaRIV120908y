package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;
        int[][] massiveMassive = new int[a][b];
        Random random = new Random();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                massiveMassive[i][j] = random.nextInt(10);
                System.out.print(massiveMassive[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        int delA = random.nextInt(a - 1);
        int delB = random.nextInt(b - 1);

        int[][] massiveMassive2 = new int[a - 1][b - 1];
        for (int i = 0, s = 0; i < a - 1; s++) {
            if (s != delA) {
                for (int j = 0, k = 0; j < b - 1; k++) {
                    if (k != delB) {
                        massiveMassive2[i][j] = massiveMassive[s][k];
                        System.out.print(massiveMassive2[i][j] + " ");
                        j++;
                    }
                }
                i++;
                System.out.println();
            }
        }
    }
}

