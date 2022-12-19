package lr4;

public class Example2 {
    public static void main(String[] args) {
        int figure = 5;
        int i ;
        int j ;

        for (i = 1; i <= figure; i++){

            for (j = 0; j < i; j++){
                System.out.print("+");
            }

            System.out.println();
            //убираю вывод нумерации, т. к. фигура ломается из-за цифр после 9
        }
    }
}
