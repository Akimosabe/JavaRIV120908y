package lr3;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Первое число: ");
        int number1 = in.nextInt();
        System.out.println("Второе число: ");
        int number2 = in.nextInt();
        int min, max;
        if (number1 > number2)
        {

            max = number1;
            min = number2;

        }
        else
        {
            max = number2;
            min = number1;
        }
            //for
            for (int i = min; i <= max; i++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
            //while
            while (min <= max){
                System.out.print(min + " ");
                min++;
            }
            System.out.println();
    }
}
