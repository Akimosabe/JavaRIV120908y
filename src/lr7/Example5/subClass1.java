package lr7.Example5;
public class subClass1 extends superClass{
    private int subint;

    subClass1(String strEx, int subintEx){
        super(strEx);
        this.subint = subintEx;
    }

    @Override
    public void getInfo() {
        System.out.println(getClass().getSimpleName() + ": str = " + this.str + ", subint = " + this.subint);
    }
}