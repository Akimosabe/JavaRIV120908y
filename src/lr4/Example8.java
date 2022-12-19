package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String value = in.nextLine();

        System.out.println("Введите ключ для шифрования");
        int key = in.nextInt();

        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];

        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] + key;
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ints[i];
        }
        String str = new StringBuilder().append("").append(chars).toString();
        System.out.println(str);


        System.out.println("Выполнить обратное преобразование? y/n :");
        boolean answer = false;

        while (!answer){
            String reply = in.next();

            if (reply.toLowerCase().equals("y")) {
                for (int i = 0; i < chars.length; i++) {
                    ints[i] = chars[i] - key;
                }
                for (int i = 0; i < chars.length; i++){
                    chars[i] = (char) ints[i];
                }
                String strr = new StringBuilder().append("").append(chars).toString();
                System.out.println(strr);
                answer = true;
            }
            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                answer = true;
            }
            else {
                System.out.println("Введите корректный ответ: ");
                answer = false;
            }
        }
    }
}
