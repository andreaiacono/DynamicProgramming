package me.andreaiacono.recursion.tree;

import static me.andreaiacono.recursion.tree.Utils.buildTree;

public class MaxValue {

    private static int max = -1;

    public static void main(String[] args) {
        Node root = buildTree();
        getMaxValueWithExternalSupport(root);
        System.out.println("Max value is " + max);
        System.out.println("Max value is " + getMaxValue(root));
    }

    private static void getMaxValueWithExternalSupport(Node current) {

        // base case
        if (current == null) {
            return;
        }

        // checks for max
        if (current.val > max) {
            max = current.val;
        }

        // processes left and right children
        getMaxValueWithExternalSupport(current.left);
        getMaxValueWithExternalSupport(current.right);
    }

    private static int getMaxValue(Node current) {

        // base case
        if (current == null) {
            return -1;
        }

        // gets the max between the left and the right children
        int maxChildren = Math.max(getMaxValue(current.left), getMaxValue(current.right));

        // returns the max between the current node and the max of the two children
        return Math.max(current.val, maxChildren);
    }
}
