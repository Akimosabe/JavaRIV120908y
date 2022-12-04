package lr2;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напиши число, проверим сколько тысяч во введеном числе");
        int number = in.nextInt();
        int  oooo = number/1000;
        System.out.println("Тысяч в числе: " + oooo%10);
    }
}
