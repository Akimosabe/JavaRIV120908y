package lr7.Example3;

public class Example3 {
    public static void main(String[] args) {
        superClass superClassTest = new superClass(512);
        String className1 = superClassTest.toString();
        System.out.println(className1);

        subClass1 FirstSubClassTest = new subClass1(1024, 'K');
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        subClass2 SecondSubClassTest = new subClass2(1024, 'K', "киллобайт");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
    }
}