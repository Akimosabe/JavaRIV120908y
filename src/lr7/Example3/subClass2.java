package lr7.Example3;

public class subClass2 extends subClass1{

    subClass2(int int1) {
        super(int1);
    }
    public String str2;
    public void setInt1Str1Str2(int int1, char char1, String str2) {
        super.int1 = int1;
        super.char1 = char1;
        this.str2 = str2;
    }
    subClass2(int int1, char char1, String str2) {
        super(int1,char1);
        setInt1Str1Str2(int1, char1, str2);
    }

    public String toString() {
        String ThirdFieldValue =
                "\n str 2 = " + this.getStr2();
        return super.toString()+ThirdFieldValue;
    }
    public String getStr2() {
        return str2;
    }
}