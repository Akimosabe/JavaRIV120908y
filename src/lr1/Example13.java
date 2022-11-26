package lr1;
import java.time.Year;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Давай сложим 2 числа, напиши любое число:");
        int n1 = in.nextInt();
        System.out.println("А теперь напиши 2-ое число:");
        int n2 = in.nextInt();
        int n3 = n1 +n2;
        System.out.println("Ага, получислось: " + n3);


    }
}
