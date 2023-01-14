package lr7.Example2;

public class superClass {
    private String str1;

    superClass() {setStr1();}
    superClass (String str1){setStr1(str1);}
    public void setStr1 (){
        this.str1 =   "здесь ничего нет";
    }
    public void setStr1 (String str1){
        this.str1 = str1;
    }
    public String getStr1(){
        //   System.out.println(str1);
        return str1;
    }
    public int getStr1length(){
        //   System.out.println("Длина текстовой строки="+str1.length());
        return str1.length();
    }
    @Override
    public String toString() {
        String superClassNameAndFieldValue = "superClassTest{" + "str1=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}";
        return superClassNameAndFieldValue;

    }
}