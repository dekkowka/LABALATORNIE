package LABA11;


class Node2 {
    public int value;
    public Node1 next;

    Node2(int value, Node1 next) {
        this.value = value;
        this.next = next;
    }
}
public class task19 {
    public static void main(String[] args) {
        Node1 head = new Node1(0, null);
        createHead(head);
        print(head);
        System.out.println();
        Node1 head2 = createTail();
        print(head2);
    }

    private static Node1 createTail() {
        Node1 head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node1(i, head);
        }
        return head;
    }

    private static void createHead(Node1 head) {
        Node1 tail = head;
        for (int i = 0; i < 9; i++) {
            tail.next = new Node1(i + 1, null);
            tail = tail.next;
        }
    }

    private static void print(Node1 ref) {
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

