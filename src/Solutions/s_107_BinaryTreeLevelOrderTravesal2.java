package Solutions;

import java.util.List;

public class s_107_BinaryTreeLevelOrderTravesal2 {
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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {



        return null;
    }

    public static void main(String[] args) {
        s_107_BinaryTreeLevelOrderTravesal2 tree_level = new s_107_BinaryTreeLevelOrderTravesal2();
        tree_level.root = new TreeNode(1);
        tree_level.root.left = new TreeNode(2);
        tree_level.root.right = new TreeNode(3);
        tree_level.root.left.left = new TreeNode(4);
        tree_level.root.left.right = new TreeNode(5);

//        tree_level.levelOrder(tree_level.root);
    }
}
