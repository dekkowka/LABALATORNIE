package LABA11;


class Node3 {

    int value;
    Node1 next;

    Node3(int value, Node1 next) {
        this.value = value;
        this.next = next;
    }
}
public class task20 {
    public static void main(String[] args) {

        MyFirstLinkedList list = new MyFirstLinkedList();

        System.out.println("Наращивание головы:");
        list.createHead(new int[]{3, 2, 1});
        list.printLinkedList();

        System.out.println("Наращивание хвоста");
        list.createFromTail(new int[]{4, 5, 6});
        list.printLinkedList();

        System.out.println("добавление элемента в начало и конец списка:");
        list.createHead(new int[]{3, 2, 1});
        list.printLinkedList();
        list.addFirst(new Node1(-5, null));
        list.addLast(new Node1(60, null));
        list.printLinkedList();

        System.out.println("добавление элемента '-1' по индексу 1:");
        list.createFromTail(new int[]{1,2,3});
        list.printLinkedList();
        list.insert(new Node1(-1, null));
        list.printLinkedList();

        System.out.println("удаление первого и последнего элементов:");
        list.createFromTail(new int[]{1,2,3,4});
        list.printLinkedList();
        list.removeFirst();
        list.removeLast();
        list.printLinkedList();

        System.out.println("удаление элемента по значению:");
        list.createFromTail(new int[]{1,2,3,4});
        list.printLinkedList();
        list.remove();
        list.printLinkedList();

        System.out.println("Наращивание головы, рекурсивно:");
        list.recursiveCreateHead(new int[]{4,3,2,1});
        list.printLinkedList();

        System.out.println("Наращивание хвоста, рекурсивно:");
        list.createFromTailRecursive(new int[]{4,3,2,1});
        list.printLinkedList();

        System.out.println("Вывод рекурсивно, исходный список:");
        list.createFromTailRecursive(new int[]{4,3,2,1});
        list.printLinkedList();
        System.out.println("Рекурсивный вывод:\n" + list.toStringRecursive());
    }
}

class MyFirstLinkedList {

    private Node1 tail = null;
    private Node1 head = null;


    void createHead(int[] values) {
        head = new Node1(values[0], null);
        tail = head;

        for (int i = 1; i < values.length; i++) {
            head = new Node1(values[i], head);
        }
    }

    void recursiveCreateHead(int[] values) {
        head = new Node1(values[0], null);
        tail = head;

        addItems_HeadRecursive(subArray(values));
    }

    private int[] subArray(int[] arr) {

        int[] newArr = new int[arr.length- 1];

        if (newArr.length >= 0) System.arraycopy(arr, 1, newArr, 0, newArr.length);

        return newArr;
    }

    private void addItems_HeadRecursive(int[] values) {
        if(values.length == 0) return;

        head = new Node1(values[0], head);

        addItems_HeadRecursive(subArray(values));
    }

    void createFromTail(int[] val) {
        head = new Node1(val[0], null);
        tail = head;

        for (int i = 1; i < val.length; i++) {
            tail.next = new Node1(val[i], null);
            tail = tail.next;
        }
    }

    void createFromTailRecursive(int[] val) {
        head = new Node1(val[0], null);
        tail = head;

        addItems_TailRecursive(subArray(val));
    }

    private void addItems_TailRecursive(int[] values) {
        if(values.length == 0) return;

        tail.next = new Node1(values[0], null);
        tail = tail.next;

        addItems_TailRecursive(subArray(values));
    }

    void printLinkedList() {
        System.out.println(toString());
    }

    void addFirst(Node1 node1) {
        node1.next = head;
        head = node1;
    }

    void addLast(Node1 node1) {
        tail.next = node1;
        tail = node1;
    }

    void insert(Node1 node1) {

        Node1 ref = head;
        while (ref != null) {

            if (ref.value == 1) {
                node1.next = ref.next;
                ref.next = node1;
                break;
            }
            ref = ref.next;
        }
    }

    void removeFirst() {
        head = head.next;
    }

    void removeLast() {

        Node1 ref = head;

        while (ref.next.next != null) {
            ref = ref.next;
        }

        ref.next = null;
        tail = ref;
    }

    void remove() {

        Node1 ref = head;

        while (ref.next.value != 3) ref = ref.next;

        ref.next = ref.next.next;
    }

    @Override
    public String toString() {

        StringBuilder build = new StringBuilder();
        Node1 ref = head;

        while (ref != null) {
            build.append(ref.value);
            build.append(" ");
            ref = ref.next;
        }

        return build.toString();
    }

    String toStringRecursive() {

        return toStringRecursiveInternal(head);
    }

    private String toStringRecursiveInternal(Node1 current) {

        if(current == null) return "";

        return current.value + " " + toStringRecursiveInternal(current.next);
    }
}


