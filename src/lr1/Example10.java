package lr1;
import java.util.Scanner;
import java.time.Year;
public class Example10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("В каком году ты родился?");
        int yaer = in.nextInt();;
        int yearNow = Year.now().getValue();
        int number = yearNow - yaer;
        System.out.println("Тебе " + number);

        in.close();

    }
}