package lr6;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Ex1
        System.out.println("Example1:");

        Example1 e1 = new Example1();

        e1.setValue('x');
        e1.setValue("y");
        e1.showValues();

        char[] c = new char[]{'x', 'y', 'z'};
        e1.setValue(c);
        c = new char[]{'z'};
        e1.setValue(c);
        e1.showValues();

//Ex2
        System.out.println("\nExample2:");
        Example2.showA();
        Example2.showA();
        Example2.showA();
        Example2.showA();
        Example2.showA();
        Example2.showA();

//Ex3
        System.out.println("\nExample3:");
        System.out.println("Max: " + Example3.getMax(3, 15, 22, 1, 150, 2));
        System.out.println("Min: " + Example3.getMin(3, 15, 22, 1, 150, 2));
        System.out.println("Avg: " + Example3.getAvg(3, 15, 22, 1, 150, 2));

//Ex4
        System.out.println("\nExample4:");
        Example4.doubleFactorial(6);
        Example4.doubleFactorial(11);
        Example4.doubleFactorial(12);

//Ex5
        System.out.println("\nExample5:");
        Example5.quadSummator(2);
        Example5.quadSummator(3);
        Example5.quadSummator(4);

//Ex6
        System.out.println("\nExample6:");
        int[] a = new int[]{10, 44, 12, 1, 55, 32, 23};
        int[] b = Example6.getArrCopy(a, 3);
        System.out.println(Arrays.toString(b));
        b = Example6.getArrCopy(a, 5);
        System.out.println(Arrays.toString(b));
        b = Example6.getArrCopy(a, 100);
        System.out.println(Arrays.toString(b));

//Ex7
        System.out.println("\nExample7:");
        c = new char[]{'a', 'b', 'q', 'd', 'n'};
        System.out.println(Arrays.toString(Example7.getCharCodes(c)));

//Ex8
        System.out.println("\nExample8:");
        a = new int[]{ 1, 2, 3, 4, 5, 6};
        System.out.println("Среднее: " + Example8.getArrAvg(a));

        // Ex9
        System.out.println("\nExample9:");
        a = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(a));
        a = Example9.replaceElements(a);
        System.out.println(Arrays.toString(a));

//Ex10
        System.out.println("\nExample10:");
        System.out.println(Arrays.toString(Example10.getMinMax(100, 12, 23, 43, 699, 299)));
    }
}