package lr3;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        char[] alphabet = new char[size];
        char letter = 'a';
        for (char i = 0; i < alphabet.length; i++)
        {
            alphabet[i] = letter++;
            letter++;
            System.out.print(alphabet[i] + " ");
        }
        System.out.println();
        for (int j = alphabet.length-1; j >= 0; j--)
        {
            System.out.print(alphabet[j] + " ");
        }

    }
}
