package lr6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example 1
        System.out.println("Example1:");

        Example1 e1 = new Example1();

        e1.setValue('a');
        e1.setValue("b");
        e1.showValues();
        char[] c = new char[]{'a', 'b', 'c'};
        e1.setValue(c);
        c = new char[]{'m'};
        e1.setValue(c);
        e1.showValues();
    }
}