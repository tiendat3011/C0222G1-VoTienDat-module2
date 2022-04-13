package _10_dsa_list.exercise.linkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst("Đạt");
        myLinkedList.addLast("Hùng");
        myLinkedList.add(1, "Lâm");
        myLinkedList.printList();
    }
}