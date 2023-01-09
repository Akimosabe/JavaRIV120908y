package lr6;

public class Example1 {
    private char chr;
    private String str;

    public void setValue(char chr) {
        this.chr = chr;
    }

    public void setValue(String str) {
        this.str = str;
    }

    public void setValue(char[] chr) {
        if(chr.length == 1)
            this.chr = chr[0];
        else
            this.str = new String(chr);
    }

    public void showValues() {
        System.out.println("chr = '" + this.chr + "' , str = \"" + this.str + "\"");
    }
}