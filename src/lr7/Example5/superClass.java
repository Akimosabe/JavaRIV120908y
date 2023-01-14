package lr7.Example5;

public class superClass {
    protected String str;

    superClass(String strEx){
        this.str = strEx;
    }

    public void getInfo(){
        System.out.println(getClass().getSimpleName() + ": str = " + this.str);
    }
}