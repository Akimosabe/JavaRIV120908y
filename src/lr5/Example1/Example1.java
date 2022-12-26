package lr5.Example1;

public class Example1 {
    private char ch1;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    public int getSCodeSymnol(){
        return ch1;
    }

    public void showCodeAndValue(){
        System.out.println(ch1);
        System.out.println((int)ch1);
    }
}
