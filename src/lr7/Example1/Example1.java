package lr7.Example1;

public class Example1 {
    public static void main(String[] args) {
        superClass superClassObject = new superClass("передал в cуперкласс");
        String className = superClassObject.toString();
        System.out.println(className);
        
        subClass subClassObject1 = new subClass("передал в подкласс");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        subClass subClassObject2 = new subClass("передал в  подкласс", "два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}