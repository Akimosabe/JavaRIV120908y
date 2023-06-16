package lr12;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер: ");
        int size = in.nextInt();

        System.out.println("Число: ");
        int numb = in.nextInt();

        int[] arr = new int[size];

        Random random = new Random();

        for(int i=0;i<size;i++){
            arr[i] = random.nextInt();
        }

        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr));

        int[] arrRes = filterEvenNumbers(arr, numb);

        System.out.println("Массив arrRes: ");
        System.out.println(Arrays.toString(arrRes));
    }

    public static int[] filterEvenNumbers(int[] arr, int a){
        return Arrays.stream(arr).filter(x -> x % a == 0).toArray();
    }
}