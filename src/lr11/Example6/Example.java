package lr11.Example6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "1");
        hashMap.put(2, "2");
        hashMap.put(3, "3");
        hashMap.put(4, "4");
        hashMap.put(5, "5");
        hashMap.put(6, "6");
        hashMap.put(7, "7");
        hashMap.put(8, "8");
        hashMap.put(9, "9");
        hashMap.put(10, "10");
        System.out.println(hashMap);

        int productOfKeys = 1;
        StringBuilder matchingStrings = new StringBuilder();

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            if (key > 5) {
                System.out.println("Строки, у которых ключ больше 5: " + value);
            }

            if (value.length() > 5) {
                productOfKeys *= key;
            }

            if (key == 0) {
                System.out.println("Строки через запятую: " + Arrays.toString(value.split(", ")));
            }
        }

        System.out.println("Результат перемноженных строк, длина которых больше 5: " + productOfKeys);
    }
}