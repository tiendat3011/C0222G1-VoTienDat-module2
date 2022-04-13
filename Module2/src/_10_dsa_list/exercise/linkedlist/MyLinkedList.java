package _10_dsa_list.exercise.linkedlist;


public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static class Node {

        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void MyLinkedList() {
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;

    }


    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }


    public void addLast(E e) {
        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                temp.next = new Node(e);
                numNodes++;
                break;
            }
            temp = temp.next;
        }
    }


    public E remove(int index) {
        Object valueRemove = null;
        Node temp = head;
        if (index == 0) {
            valueRemove = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index && temp.next != null; i++) {
                valueRemove = temp.next.data;
                temp = temp.next;
            }
            assert temp.next != null;
            temp.data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) valueRemove;
    }


    public int size() {
        return numNodes;
    }

    public boolean contains(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == o) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == o) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        Node temp = head;
        return (E) temp.getData();
    }

    public E getLast() {
        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                return (E) temp.getData();
            }
            temp = temp.next;
        }
        return null;
    }

    public void clear() {
        for (Node temp = head; temp != null; ) {
            temp = null;
            temp.data = null;
            temp = temp.next;
        }
        head = null;
        numNodes = 0;
    }

    @Override
    public String toString() {
        String str = "[";
        Node temp = head;
        while (temp != null) {
            str += temp.getData();
            if (temp.next == null) {
                break;
            }
            str += ",";
            temp = temp.next;
        }
        str += "]";
        return str;
    }
}
