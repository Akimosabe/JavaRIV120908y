package lr11.Example7;

import java.util.LinkedList;
import java.util.Scanner;

public class Link {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество людей в кругу: ");
        int N = scanner.nextInt();

        LinkedList<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int currentIndex = 0;
        while (circle.size() > 1) {
            currentIndex = (currentIndex + 1) % circle.size();
            circle.remove(currentIndex);
        }

        System.out.println("Остался человек под номером: " + circle.get(0));
    }
}