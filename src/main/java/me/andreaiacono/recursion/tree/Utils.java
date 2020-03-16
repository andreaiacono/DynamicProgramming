package me.andreaiacono.recursion.tree;

public class Utils {

    // builds the tree in /src/main/resources/images/binary_tree.png
    public static Node buildTree() {
        Node root = new Node(1);
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
        return root;
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