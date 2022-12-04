package timus.task_1877;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = in.nextInt();
        int y = in.nextInt();

        if (x%2 == 0 || y%2 != 0){
            System.out.println("yes");}

            else System.out.println("no");

    }
}
