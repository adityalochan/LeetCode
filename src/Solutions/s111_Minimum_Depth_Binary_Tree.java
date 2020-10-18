package Solutions;

public class s111_Minimum_Depth_Binary_Tree {
    int min_depth= Integer.MAX_VALUE;
//    Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int minDepth(TreeNode root) {
        if(root==null){ return 0;
        }



        return 0;
    }


    public static void main(String[] args) {
        TreeNode t = new TreeNode(3,new TreeNode(9,null,null),new TreeNode(20,new TreeNode(15,null,null),new TreeNode(7,null,null)));
        s111_Minimum_Depth_Binary_Tree s = new s111_Minimum_Depth_Binary_Tree();
        s.minDepth(t);
    }
}
