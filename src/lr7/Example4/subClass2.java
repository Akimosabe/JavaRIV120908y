package lr7.Example4;

public class subClass2 extends subClass1 {
    public int subint;

    subClass2(char supercharEx, String substringEx, int subintEx){
        super(supercharEx, substringEx);
        this.subint = subintEx;
    }

    subClass2(subClass2 copyClass){
        super(copyClass.superchar, copyClass.substring);
        this.subint = copyClass.subint;
    }

    @Override
    public String toString() {
        return "subClass2{" +
                "subint=" + subint +
                ", substring='" + substring + '\'' +
                ", superchar=" + superchar +
                '}';

    }
}