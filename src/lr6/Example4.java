package lr6;

public class Example4 {
    public static void doubleFactorial(int n){
        int f = 0;

        if(n > 0) {
            f=n;
            int nn = n;
            while(nn > 2)
            {
                nn -= 2;
                f *= nn;
            }
        }

        System.out.println(n + "!! = " + f);
    }
}