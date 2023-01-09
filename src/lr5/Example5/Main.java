package lr5.Example5;

public class Main {
    public static void main(String[] args) {
        Example5 ex5 = new Example5(99);
        ex5.checkI();
        ex5 = new Example5(9999);
        ex5.checkI();
        ex5 = new Example5(11);
        ex5.setI();
        ex5.checkI();


        System.out.println();
    }
}