package LABA11;


class Node1 {
    public int value;
    public Node1 next;

    Node1(int value, Node1 next) {
        this.value = value;
        this.next = next;
    }
}
public class task18 {
    public static void main(String[] args) {
        Node1 node10 = new Node1(0, null);
        Node1 node1 = new Node1(1, null);
        Node1 node12 = new Node1(2, null);
        Node1 node13 = new Node1(3, null);
        node10.next = node1;
        node1.next = node12;
        node12.next = node13;

        Node1 ref = node10;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}


