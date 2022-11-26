package lr1;
import java.util.Scanner;
import java.time.Year;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько тебе лет?");
        int yaer = in.nextInt();
        int yearNow = Year.now().getValue();
        int number = yearNow - yaer;
        System.out.println("Ты родился в " + number);

    }
}