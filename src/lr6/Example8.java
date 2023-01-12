package lr6;

public class Example8 {
    public static float getArrAvg(int[] a){
        int sum = 0;

        for(int i=0; i<a.length; i++){
            sum += a[i];
        }

        return (float)sum / a.length;
    }
}