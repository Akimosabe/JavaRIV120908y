package lr3;
import java.util.*;
public class Example10  {
    public static void main(String[] args)
    {
        Random random = new Random();
        int numbers[] = new int[10];
        int numbersrev[] = new int[10];

        for (int i = 0; i < 10; i++)
        {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        Arrays.sort(numbers);
        for (int i = 0; i < 10; i++)
        {
            numbersrev[i]=numbers[9-i];
            System.out.print(numbersrev[i] + " ");
        }

    }
}
