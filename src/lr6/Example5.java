package lr6;

public class Example5 {
    public static void quadSummator(int n) {
        int qs = 0;

        for(int i = 1; i <= n; i++) {
            qs += i * i;
        }

        System.out.println("Сумма квадратов чисел от 1 до " + n + " = " + qs);
    }
}
