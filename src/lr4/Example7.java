package lr4;
public class Example7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 0;
        int[][] massive = new int[a][b];

        for(int i = 0; i < a; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < b; j++, c++) {
                    massive[i][j] = c;
                }
            }
            else {
                for (int j = b-1; j >= 0; j--, c++) {
                    massive[i][j] = c;
                }
            }
        }
        for(int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++){
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
    }
}