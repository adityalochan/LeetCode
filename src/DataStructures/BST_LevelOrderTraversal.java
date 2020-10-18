package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class BST_LevelOrderTraversal {
    public static class Node {
        int data;
        Node left, right;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    Node root;
    public void printLevelOrderTraversal() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.println(tempNode.data + " ");
            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        BST_LevelOrderTraversal tree_level = new BST_LevelOrderTraversal();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrderTraversal();
    }
}
