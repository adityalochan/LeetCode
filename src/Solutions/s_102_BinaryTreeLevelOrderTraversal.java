package Solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class s_102_BinaryTreeLevelOrderTraversal {

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    TreeNode root;

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int counter = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        if (root == null) {
            return list;
        }
        while (!queue.isEmpty()) {
            list.add(new ArrayList<Integer>());
            int current_level = queue.size();
            for (int i = 0; i < current_level; i++) {
                TreeNode temp = queue.poll();
                list.get(counter).add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            counter++;
        }
        return list;
    }

    public static void main(String[] args) {
        s_102_BinaryTreeLevelOrderTraversal tree_level = new s_102_BinaryTreeLevelOrderTraversal();
        tree_level.root = new TreeNode(1);
        tree_level.root.left = new TreeNode(2);
        tree_level.root.right = new TreeNode(3);
        tree_level.root.left.left = new TreeNode(4);
        tree_level.root.left.right = new TreeNode(5);

        tree_level.levelOrder(tree_level.root);
    }
}
