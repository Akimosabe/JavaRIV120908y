package lr5.Example5;

public class Example5 {
    private int i;

    public Example5(int i){
        this.setI(i);
    }
    public void setI() {
        this.i = 0;
    }

    public void setI(int i) {
        this.i = i > 100 ? 100 : i;
    }

    public void checkI(){
        System.out.println("Значение: " + this.i);
    }
}