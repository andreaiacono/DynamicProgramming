package me.andreaiacono.recursion.tree;

public class BinaryTree {

    public static void main(String[] args) {

        // builds the tree in /src/main/resources/images/binary_tree.png
        Node root = new Node(2);
        Node left = new Node(7);
        Node leftLeft = new Node(2);
        Node leftRight = new Node(6);
        Node leftRightLeft = new Node(5);
        Node leftRightRight = new Node(11);
        Node right = new Node(5);
        Node rightRight = new Node(9);
        Node rightRightLeft = new Node(4);
        root.left = left;
        root.right = right;
        left.left = leftLeft;
        left.right = leftRight;
        leftRight.left  = leftRightLeft;
        leftRight.right  = leftRightRight;
        right.right = rightRight;
        rightRight.left = rightRightLeft;

        System.out.print("\nPreOrder: ");
        preOrder(root);
        System.out.print("\nInOrder: ");
        inOrder(root);
        System.out.print("\nPostPreOrder: ");
        postOrder(root);
    }

    private static void preOrder(Node current) {

        // base case
        if (current == null) {
            return;
        }

        // processes the node
        System.out.print(current.val + ", ");

        // processes the left and then the right children
        preOrder(current.left);
        preOrder(current.right);
    }

    private static void inOrder(Node current) {

        // base case
        if (current == null) {
            return;
        }

        // processes the left child
        inOrder(current.left);

        // processes the node
        System.out.print(current.val + ", ");

        // // processes then right children
        inOrder(current.right);
    }

    private static void postOrder(Node current) {

        // base case
        if (current == null) {
            return;
        }

        // processes the left child and then the right child
        postOrder(current.left);
        postOrder(current.right);

        // processes the node
        System.out.print(current.val + ", ");
    }
}


class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
}