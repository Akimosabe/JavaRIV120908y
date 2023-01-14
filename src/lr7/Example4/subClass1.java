package lr7.Example4;

public class subClass1  extends superClass{
    public String substring;
    subClass1(char supercharEx, String substringEx){
        super(supercharEx);
        this.substring = substringEx;
    }

    subClass1(subClass2 copyClass){
        super(copyClass.superchar);
        this.substring = copyClass.substring;
    }

    @Override
    public String toString() {
        return "subClass1{" +
                "substring='" + substring + '\'' +
                ", superchar=" + superchar +
                '}';
    }
}