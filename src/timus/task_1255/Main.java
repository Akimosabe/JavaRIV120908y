package task_1255;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();
        int res;

        int i = 2*(N%K)-K;
        if(i<0) i=0;
        if(N<K) res = 0;
        else res = (N/K)*(N+N%K)+i;

        System.out.println(res);
    }
}