package lr6;

public class Example7 {
    public static int[] getCharCodes(char[] c){
        int[] codes = new int[c.length];

        for(int i=0;i<c.length;i++){
            codes[i] = c[i];
        }

        return codes;
    }
}