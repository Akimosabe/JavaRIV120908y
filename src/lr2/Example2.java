package lr2;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи число, которое при делении на пять будет давать остаток два, а при делении на семь остаток один:");
        int number = in.nextInt();
        int div5 = number % 5;
        int div7 = number % 7;
        System.out.println(number + " / 5 = " + div5 + "  ;  " + number + " / 7 = " + div7);
        if (div5 == 2 && div7 == 1) {
            System.out.println("Нужное число");}

            else if (div5 == 2 && div7 != 1) {
                System.out.println("Совпадает только остаток при делении на пять");}

            else if (div5 == 1 && div7 != 2) {
                System.out.println("Совпадает только остаток при делении на семь");}

                else System.out.println("Число не подходит");

        }
    }
