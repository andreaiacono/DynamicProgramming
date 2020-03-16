package me.andreaiacono.recursion.list;

public class Node {
    final int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public static Node createList() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        first.next = second;
        second.next = third;
        third.next = fourth;

        return first;
    }
}