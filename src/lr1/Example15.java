package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напиши число:");
        int n1 = in.nextInt();
        System.out.println("А теперь напиши 2-ое число:");
        int n2 = in.nextInt();

        int n3 = n1 +n2;
        int n4 = n1 -n2;

        System.out.println(n3 + " " + n4);


    }

}
