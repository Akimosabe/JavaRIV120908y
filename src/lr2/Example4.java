package lr2;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напиши число, проведем проверку попадает ли оно в диапазон от 5 до 10");
        int number = in.nextInt();
        if (number >= 5 && number <= 10){
            System.out.println("Попадает");}
        else System.out.println("Не попадает");

    }
}
