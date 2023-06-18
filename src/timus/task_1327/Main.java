package timus.task_1327;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;
        for (int day = a; day <= b; day++) {
            if (day % 2 != 0)
                count += 1;
        }


        System.out.println(count);
    }
}