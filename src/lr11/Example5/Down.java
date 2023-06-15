package lr11.Example5;

public class Down {
    public static void main(String[] args) {
        Node down = new Node(0, null);

        for(int i=1;i<=9;i++) down = new Node(i, down);

        Node ref = down;
        while(ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}