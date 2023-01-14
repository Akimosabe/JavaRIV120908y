package lr7.Example4;

public class Example4 {
    public static void main(String[] args) {
        superClass sup = new superClass('A');
        System.out.println(sup.toString());

        subClass1 sub1 = new subClass1('B', "subClass1");
        System.out.println(sub1.toString());

        subClass2 sub2 = new subClass2('C', "subClass2", 123);
        System.out.println(sub2.toString());

        subClass2 sub2copy = new subClass2(sub2);
        System.out.println(sub2copy.toString());

    }
}