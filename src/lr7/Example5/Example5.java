package lr7.Example5;

public class Example5 {
    public static void main(String[] args) {
        superClass sup = new superClass("superClass");
        sup.getInfo();

        subClass1 sub1 = new subClass1("subClass1", 100);
        sub1.getInfo();

        subClass2 sub2 = new subClass2("subClass2", 'O');
        sub2.getInfo();

        superClass subsup = new subClass1("superClass", 50);
        subsup.getInfo();
    }
}