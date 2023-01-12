package lr6;

import java.util.Arrays;

public class Example6 {
    public static int[] getArrCopy(int[] arr, int e){
        return Arrays.copyOf(arr, (Math.min(e, arr.length)));
    }
}