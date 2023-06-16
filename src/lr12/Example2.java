package lr12;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Размер: ");
            int size = in.nextInt();

            int[] arrx = new int[size];
            int[] arry = new int[size];
            Random random = new Random();

            for(int i=0;i<size;i++){
                arrx[i] = random.nextInt(200);
                arry[i] = random.nextInt(200);
            }

            System.out.println("Массив arrx: ");
            System.out.println(Arrays.toString(arrx));
            System.out.println("Массив arry: ");
            System.out.println(Arrays.toString(arry));

            int[] arrResult = findCommonElements(arrx, arry);

            System.out.println("Массив arrResult: ");
            System.out.println(Arrays.toString(arrResult));
        }

        public static int[] findCommonElements(int[] arrx, int[] arry){
            return Arrays.stream(arrx).filter(x -> Arrays.stream(arry)
                            .anyMatch(y -> y == x))
                    .toArray();
        }
    }