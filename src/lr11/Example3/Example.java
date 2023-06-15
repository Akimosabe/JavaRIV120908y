package lr11.Example3;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество элементов в массиве: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Перечисли элементы:");
        setInputArray(array, 0);

        System.out.println("Массив:");
        getOutputArray(array, 0);
    }
    public static void setInputArray(int[] array, int index) {
        if (index < array.length) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            array[index] = number;
            setInputArray(array, index + 1);
        }
    }
    public static void getOutputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + "\t");
            getOutputArray(array, index + 1);
        }
    }
}