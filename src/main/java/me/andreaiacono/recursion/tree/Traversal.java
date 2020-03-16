package me.andreaiacono.recursion.tree;

import static me.andreaiacono.recursion.tree.Utils.buildTree;

public class Traversal {

    public static void main(String[] args) {
        Node root = buildTree();

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

