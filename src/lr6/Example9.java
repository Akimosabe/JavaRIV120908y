package lr6;

public class Example9 {
    public static int[] replaceElements(int[] a){
        int tmp;

        for(int i = 0; i < (a.length / 2); i++){
            tmp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = tmp;
        }

        return a;
    }
}