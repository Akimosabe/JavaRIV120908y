package lr11.Example5;

public class Top {
    public static void main(String[] args) {
        Node top = new Node(0, null);

        for(int i=1;i<=9;i++){
            Node newDown = new Node(i, null);

            Node ref = top;
            while (ref.next != null) ref = ref.next;

            ref.next = newDown;
        }

        Node ref = top;
        while(ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}