package lr7.Example2;

public class Example2 {
    public static void main(String[] args) {
        superClass Test = new superClass();
        String superClassTest0 = Test.toString();
        System.out.println(superClassTest0);

        superClass Test1 = new superClass("test this");
        String superClassTest1 = Test1.toString();
        System.out.println(superClassTest1);

        superClass Test2 = new subClass();
        String subClassTest0 = Test2.toString();
        System.out.println(subClassTest0);

        superClass Test3 = new subClass("test this too");
        String subClassTest1 = Test3.toString();
        System.out.println(subClassTest1);

        superClass Test4 = new subClass(256);
        String subClassTest2 = Test4.toString();
        System.out.println(subClassTest2);

        superClass Test5 = new subClass("test this and this", 256);
        String subClassTest3 = Test5.toString();
        System.out.println(subClassTest3);

    }
}