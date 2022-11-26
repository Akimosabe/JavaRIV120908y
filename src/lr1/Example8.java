package lr1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Название текущего дня недели: ");
        String day = in.nextLine();

        System.out.println("Название текущего месяца: ");
        String month = in.nextLine();

        System.out.println("Номер дня в месяце: ");
        int number = in.nextInt();;

        System.out.println("День: " + day);
        System.out.println("Месяц: " + month);
        System.out.println("Число: " + number);
        in.close();

    }
}