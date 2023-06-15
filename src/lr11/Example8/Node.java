package lr11.Example8;

public class Node {
    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public void createHead(int value) {
        Node newNode = new Node(this.value, this.next);
        this.value = value;
        this.next = newNode;
    }

    public void createTail(int value) {
        Node newTail = new Node(value, null);
        Node ref = this;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node ref = this;
        while (ref != null) {
            result.append(ref.value).append(" ");
            ref = ref.next;
        }
        return result.toString();
    }

    public void addFirst(int value) {
        createHead(value);
    }

    public void addLast(int value) {
        createTail(value);
    }

    public void insert(int position, int value) {
        Node newNode = new Node(value, null);
        Node ref = this;
        int count = 1;
        while (ref.next != null && count < position) {
            ref = ref.next;
            count++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
    }

    public void removeFirst() {
        Node newHead = this.next;
        this.value = newHead.value;
        this.next = newHead.next;
        newHead.next = null;
    }

    public void removeLast() {
        Node ref = this;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void remove(int position) {
        Node ref = this;
        int count = 1;
        while (ref.next != null && count < position) {
            ref = ref.next;
            count++;
        }
        if (ref.next != null) {
            ref.next = ref.next.next;
        }
    }
}