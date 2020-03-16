package me.andreaiacono.recursion.tree;

import static me.andreaiacono.recursion.tree.Utils.buildTree;

public class BalancedTree {
    public static void main(String[] args) {
        Node root = buildTree();
        System.out.println("Is tree balanced: " + isBalanced(root));
    }

    private static boolean isBalanced(Node root) {
        return getTreeHeight(root) != -1;
    }

    private static int getTreeHeight(Node current) {

        // base case
        if (current == null) {
            return 0;
        }

        // gets the heights of the left and right branches
        int leftHeight = getTreeHeight(current.left);
        int rightHeight = getTreeHeight(current.right);

        // if the left branch or the right branches are already been computed as not balanced,
        // or if this node has their children unbalanced (their height differs for more than 1)
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {

            // returns an error code
            return -1;
        }

        // adds 1 to the current height (the max between the left and right branches) and returns it
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
