package lr4;

public class Example1 {
    public static void main(String[] args) {
        int figure = 11;
        int i;
        int j;
        int z;

        for (i = 1; i <= figure; i ++)
        {
            //убираю вывод нумерации, т. к. фигура ломается из-за цифр после 9
            z = 0;
            for ( j = -12; j < figure; j ++ )
            {
                System.out.print("+");
                z = z + 1;
            }
            System.out.println();
        }
    }
}