package lr5.Example4;
public class Example4 {
    private char c;
    private int i;

    public Example4(int i, char c){
        this.c = c;
        this.i = i;
    }

    public Example4(double d){
        this.c = (char)((int)d);
        this.i = (int)((d%1)*100);
    }
    public void print(){
        System.out.println(c + " " + i);
    }
}