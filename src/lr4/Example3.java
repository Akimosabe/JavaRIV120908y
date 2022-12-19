package lr4;

public class Example3 {
    public static void main(String[] args) {
        int [] [] x = new int [6][10];

        for (int i=0; i <6; i++ ) {
            for (int j = 0; j < 10; j ++) {
                x[i][j] = 2;
            }
        }
        for (int i =0; i < 6; i++) {

            for (int j = 0; j < 10; j ++) {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();

        }
    }
}