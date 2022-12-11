package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size  = id.nextInt();
        System.out.println("Размер " + size);
        int [] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(200);
            System.out.println("Эллемент массива ["+i+"] после сортировки = "+ nums[i]);
        }
    }
}
