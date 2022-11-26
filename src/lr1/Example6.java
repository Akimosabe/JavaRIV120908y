package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напиши имя");
        String Name = in.nextLine();

        System.out.println("Напиши фамилию: ");
        String Surname = in.nextLine();

        System.out.println("Напиши отвество: ");
        String Patronymic = in.nextLine();

        System.out.println("Привет, " + Surname + " " + Name + " " + Patronymic + " ");
        in.close();

    }
}