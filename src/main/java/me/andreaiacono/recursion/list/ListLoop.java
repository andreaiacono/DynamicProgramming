package me.andreaiacono.recursion.list;

public class ListLoop {

    public static void main(String[] args) {
        Node root = Node.createList();
        System.out.println("Loop:");
        loop(root);
        System.out.println("Reverse Loop:");
        reverseLoop(root);
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
}
