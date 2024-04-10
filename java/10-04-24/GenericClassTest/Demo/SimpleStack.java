class SimpleStack<V> {

    private Node head;

    class Node {
        V value;
        Node tail;

        Node(V val) {
            value = val;
            tail = head;
        }
    }

    public void push(V val) {
        head = new Node(val);
    }

    public V pop() {
        V item = head.value;
        head = head.tail;
        return item;
    }

    public boolean empty() {
        return head == null;
    }
}