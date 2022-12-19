package lr4;

public class Example3 {
    public static void main(String[] args) {
        int [] [] x = new int [6][10];
        int a = 0;
        int b;

        for (int i=0; i <6; i++ )
        {
            for (int j = 0; j < 10; j ++)
            {
                x[i][j] = 2;
            }
        }
        for (int i =0; i < 6; i++)
        {
            b = i+1;
            for (int j = 0; j < 10; j ++)
            {
                System.out.print(x[i][j]+" ");
                a++;
            }
            System.out.println();
            a = 0;
        }
    }
}