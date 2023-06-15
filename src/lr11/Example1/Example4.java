package lr11.Example1;

public class Example4 {
    public static int fact(int x) {
        int result;
        if (x == 1) {
            return 1;
        } else {
            result = fact(x - 1) * x;
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}