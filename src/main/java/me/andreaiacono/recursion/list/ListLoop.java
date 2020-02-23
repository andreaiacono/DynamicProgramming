package me.andreaiacono.recursion.list;

public class ListLoop {

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        first.next = second;
        second.next = third;
        System.out.println("Loop:");
        loop(first);
        System.out.println("Reverse Loop:");
        reverseLoop(first);
    }

    static void loop(Node current) {

        // base case
        if (current == null) {
            return;
        }

        // prints the value of the node
        System.out.println("Node " + current.val);

        // calls the next node in the list
        loop(current.next);
    }

    static void reverseLoop(Node current) {

        // base case
        if (current == null) {
            return;
        }

        // calls the next node in the list
        reverseLoop(current.next);

        // prints the value of the node
        System.out.println("Node " + current.val);
    }


    static class Node {
        private final int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
