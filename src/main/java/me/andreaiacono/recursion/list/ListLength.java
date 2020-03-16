package me.andreaiacono.recursion.list;

public class ListLength {

    public static void main(String[] args) {
        Node root = Node.createList();
        System.out.println("List length: " + getListLength(root));
    }

    private static int getListLength(Node current) {
        if (current == null) {
            return 0;
        }

        return 1 + getListLength(current.next);
    }
}
