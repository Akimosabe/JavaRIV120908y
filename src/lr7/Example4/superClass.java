package lr7.Example4;

public class superClass {
    public char superchar;

    superClass(){}

    superClass(char supercharEx){
        this.superchar = supercharEx;
    }

    superClass(superClass copyClass){
        this.superchar = copyClass.superchar;
    }

    @Override
    public String toString() {
        return "superClass{" +
                "superchar=" + superchar +
                '}';
    }
}