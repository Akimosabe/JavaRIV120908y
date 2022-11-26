package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи имя: ");
        String name = in.nextLine();

        System.out.println("Введи возраст: ");
        int age = in.nextInt();

        System.out.println("Твое имя: " + name + ", твой возраст: " + age);

        in.close();

    }
}
