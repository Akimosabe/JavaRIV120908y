package lr11.Example2;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Целое число:");
        int i = in.nextInt();
        System.out.println( i + " в двоичном формате:");
        getBinary(i);
    }

    public static void getBinary(int n){
        if(n <= 1) System.out.print(n);
        else{
            getBinary(n/2);
            System.out.print(n%2);
        }
    }

}