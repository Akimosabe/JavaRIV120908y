package lr4;

public class Example1 {
    public static void main(String[] args) {
        int figure = 11;
        int i;
        int j;
        for (i = 1; i <= figure; i ++)
        {
            //убираю вывод нумерации, т. к. фигура ломается из-за цифр после 9
            for ( j = -12; j < figure; j ++ )
            {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}