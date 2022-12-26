package lr5.Example1;

import lr5.Example1.Example1;

public class Main {
    public static void main(String[] args) {

        Example1 example1 = new Example1();

        example1.setCh1('K');
        System.out.println(example1.getSCodeSymnol());

        example1.showCodeAndValue();
    }
}

//     1. Напишите программу с классом, в котором есть закрытое символьное поле
//        и три открытых метода. Один из методов позволяет присвоить значение полю.
//        Еще один метод при вызове возвращает результатом код символа. Третий
//        метод позволяет вывести в консольное окно символ (значение поля) и его код.