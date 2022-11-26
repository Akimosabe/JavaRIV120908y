package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напиши число:");
        int n1 = in.nextInt();
        int n2 = n1-1;
        int n3= n1+1;
        int n4=n1+n2+n3;
        n4 = n4 *n4;
        System.out.println(n2 + " " +n1+ " "+ n3 + " " +n4);


    }
}
