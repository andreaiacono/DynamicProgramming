package me.andreaiacono.recursion.graph;

import java.util.*;

public class Traversal {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.neighbours.add(node5);
        node1.neighbours.add(node2);
        node5.neighbours.add(node4);
        node5.neighbours.add(node2);
        node5.neighbours.add(node1);
        node2.neighbours.add(node1);
        node2.neighbours.add(node5);
        node2.neighbours.add(node3);
        node4.neighbours.add(node3);
        node4.neighbours.add(node5);
        node4.neighbours.add(node6);
        node3.neighbours.add(node2);
        node3.neighbours.add(node4);
        node6.neighbours.add(node4);

        System.out.print("Recursive DFS: ");
        dfs(node1, new HashSet<>());
        System.out.print("\nIterative DFS: ");
        iterativeDfs(node1);
    }

    static void dfs(Node current, Set<Node> visited) {

        // processes the current node
        System.out.print("Node " + current.val + ", ");

        // adds the current node to the set of already visited nodes
        visited.add(current);

        // loops over the neighbours of the current node
        for (Node neighbour: current.neighbours) {

            // if the neighbour has not been already visited
            if (! visited.contains(neighbour)) {

                // recursively processes the neighbour
                dfs(neighbour, visited);
            }
        }
    }

    static void iterativeDfs(Node startingNode) {

        // creates the set of the visited nodes
        Set<Node> markedAsVisited = new HashSet<>();

        // creates a stack for piling up the nodes to visit
        ArrayDeque<Node> toBeVisited = new ArrayDeque<>();

        // sets the starting node as to be visited
        toBeVisited.push(startingNode);

        // adds the starting node to the set of marked as visited nodes
        markedAsVisited.add(startingNode);

        // while there nodes to visit
        while (!toBeVisited.isEmpty()) {

            // gets the current node
            Node current = toBeVisited.pop();

            // processes the node
            System.out.print("Node " + current.val + ", ");

            // loops over the neighbours of the current node
            for (Node neighbour: current.neighbours) {

                // if the neighbour has not been already visited
                if (! markedAsVisited.contains(neighbour)) {

                    // adds the neighbour to the ones to be visited
                    toBeVisited.push(neighbour);

                    // adds the neighbour to the set of marked as visited nodes
                    markedAsVisited.add(neighbour);
                }
            }
        }
    }
}

class Node {
    int val;
    List<Node> neighbours = new ArrayList<>();

    public Node(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return val == node.val;
    }

    @Override
    public int hashCode() {
        return val;
    }
}