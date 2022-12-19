package lr4;

public class Example3 {
    public static void main(String[] args) {
        int y = 10;
        int x = 6;
        int [] [] z = new int [x][y];
        int a = 0;
        int b;

        for (int i=0; i <x; i++ )
        {
            for (int j = 0; j < y; j ++)
            {
                z[i][j] = 2;
            }
        }
        for (int i =0; i < x; i++)
        {
            b = i+1;
            for (int j = 0; j <y; j ++)
            {
                System.out.print(z[i][j]+" ");
                a++;
            }
            System.out.println();
            a = 0;
        }
    }
}