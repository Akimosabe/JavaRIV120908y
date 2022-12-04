package lr2;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи число, которое делится на четыре, но при этом не меньше десяти");
        int number = in.nextInt();
        int div4 = number % 4;

        if (div4 == 0 && number >= 10){
            System.out.println("Верное число");}

            else if(div4 == 0 && number < 10){
                System.out.println("Число меньше 10");}

            else if (div4 != 0 && number >= 10){
                System.out.println("Не делится на 4");}
            else System.out.println("Точно не то"); // от- 3 до 3
        }
    }

