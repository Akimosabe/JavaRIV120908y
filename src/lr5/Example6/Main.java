package lr5.Example6;
public class Main {
    public static void main(String[] args) {
        Example6 ex6 = new Example6(1);
        ex6.showMinMax();
        ex6.setVal(3, 0);
        ex6.showMinMax();
        ex6.setVal(-1, 10);
        ex6.showMinMax();

        System.out.println();

        ex6 = new Example6(0, 4);
        ex6.showMinMax();
        ex6.setVal(100);
        ex6.showMinMax();
        ex6.setVal(-33,33);
        ex6.showMinMax();

        System.out.println();
    }
}