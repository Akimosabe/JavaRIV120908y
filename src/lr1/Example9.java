package lr1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Как называется текущий месяц?");
        String month = in.nextLine();

        System.out.println("А сколько в нем дней?");
        int number = in.nextInt();;

        System.out.println("Понятно, это - " + month + ", количество дней в нем: " + number);

        in.close();

    }
}