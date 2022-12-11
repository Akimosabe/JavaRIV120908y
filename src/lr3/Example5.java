package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        if (size > 0) {
            Random random = new Random();
            int[] ints = new int[size];
            int summa = 0;
            for (int i = 0; i < ints.length; i++) {
                boolean iterator = true;
                int x = 0;
                while (iterator) {
                    x = random.nextInt(100);
                    if ((x % 5 == 2) && (x%3==1)) {
                        iterator = false;
                    }
                }
                ints[i] = x;
                summa += ints[i];
            }
            System.out.println(Arrays.toString(ints));
            System.out.println(+summa);
        } else {
            System.out.println("Ошибка");
        }
    }
}