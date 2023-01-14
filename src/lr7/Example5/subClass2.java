package lr7.Example5;

public class subClass2 extends superClass {
    protected char subchar;

    public subClass2(String strEx, char subcharEx){
        super(strEx);
        this.subchar = subcharEx;
    }

    @Override
    public void getInfo() {
        System.out.println(getClass().getSimpleName() + ": str = " + this.str + ", subchar = " + this.subchar);
    }
}