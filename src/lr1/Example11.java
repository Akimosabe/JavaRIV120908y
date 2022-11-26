package lr1;
import java.util.Scanner;
import java.time.Year;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Как тебя зовут?");
        String name = in.nextLine();
        System.out.println("А в каком году ты родился, " + name + "?");
        int yaer = in.nextInt();
        int yearNow = Year.now().getValue();
        int number = yearNow - yaer;
        System.out.println(name + ", тебе " + number);

        in.close();

    }
}