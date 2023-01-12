package lr6;

import java.util.Arrays;

public class Example10 {
    public static int[] getMinMax(int ... v){
        Arrays.sort(v);

        int[] ret = new int[2];
        ret[0] = v[0];
        ret[1] = v[v.length-1];

        return ret;
    }
}