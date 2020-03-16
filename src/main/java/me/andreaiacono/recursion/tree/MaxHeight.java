package me.andreaiacono.recursion.tree;

import static me.andreaiacono.recursion.tree.Utils.buildTree;

public class MaxHeight {

    public static void main(String[] args) {
        Node root = buildTree();
        System.out.println("Max height is " + getMaxHeight(root));
    }

    private static int getMaxHeight(Node current) {

        // base case
        if (current == null) {
            return 0;
        }

        // gets the max height between the left and the right children, and sums 1
        return 1 + Math.max(getMaxHeight(current.left), getMaxHeight(current.right));
    }
}
