package lr5.Example6;

public class Example6 {
    private int max, min;

    public Example6(int a){
        this.setVal(a);
    }
    public Example6(int a, int b){
        this.setVal(a, b);
    }

    public void setVal(int a) {
        this.updateValues(a, a);
    }

    public void setVal(int a, int b){
        this.updateValues(a, b);
    }

    public void showMinMax(){
        System.out.println("min: " + min + ", max: " + max);
    }

    private void updateValues(int a, int b) {
        this.max = Math.max(this.max, Math.max(a, b));
        this.min = Math.min(this.min, Math.min(a, b));
    }
}