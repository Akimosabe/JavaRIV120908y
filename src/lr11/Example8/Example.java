package lr11.Example8;

public class Example {
    public static void main(String[] args) {
        Node head = new Node(1, null);
        System.out.println(head);
        head.createHead(2);
        System.out.println(head);
        head.createTail(3);
        System.out.println(head);
        head.addFirst(4);
        System.out.println(head);
        head.addLast(5);
        System.out.println(head);
        head.insert(2, 6);
        System.out.println(head);
        head.removeFirst();
        System.out.println(head);
        head.removeLast();
        System.out.println(head);
        head.remove(2);
        System.out.println(head);
    }
}