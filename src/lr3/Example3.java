package lr3;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int l  = in.nextInt();
    int[] x = new int[l];
    x[0] = 1;
    x[1] = 1;
    for (int i = 2; i < l; ++i) {
        x[i] = x[i - 1]+ x[i - 2];
    } for (int i = 0; i < l; ++i) {
        System.out.println(x[i]);
    }

    int a = 1;
    int b = 0;
    int c = 1;
    while(a<=l)
    {
        int sum =  b + c;
        c = sum;
        a++;

    }


}
}



//Напишите программу, которая выводит последовательность чисел Фибоначчи. Первые два числа в этой последовательности равны 1,
//а каждое cледующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
//Количество чисел в последовательности вводится пользователем.
//Предложите версии программы, использующие разные операторы цикла.