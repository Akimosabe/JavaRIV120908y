package lr4;

public class Example4 {
    public static void main(String[] args) {
        int [][] triangle = new int [5][];
        for (int i = 0; i < 5; i++ ){
            int j = i+1;
            triangle[i] = new int[j];
        }
        for (int i =0; i < 5; i++){
            for (int j = 0; j <i+1; j++){
                triangle[i][j] = 5;
            }
        }
        for (int i =0; i < 5; i++){
            for (int j = 0; j < i+1; j++){
                System.out.print(triangle[i][j]+" ");
            }
            System.out.println();
        }
    }
}