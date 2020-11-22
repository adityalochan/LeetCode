package Solutions;

public class s_111_Minimum_Depth_Binary_Tree {
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

    //can be solved in 3 ways
    // recursive call
    // DFS : LevelOrderTraversal
    // BFS
    public int minDepth(TreeNode root) {
//The below one is recursive call solution
            int min_depth_val = Integer.MAX_VALUE;
            if(root==null){
                return 0;
            }
            if(root.left==null && root.right==null){
                return 1;
            }
            if(root.left!=null){
                min_depth_val=Math.min(minDepth(root.left),min_depth_val);
            }
            if(root.right!=null){
                min_depth_val=Math.min(minDepth(root.right),min_depth_val);
            }
            return min_depth_val+1;
        }
//        The below is DFS which is not working. There is additions code in while loop that unable to understand. Check Leetcode solution
/*        int depth = 1;
        TreeNode tempNode = new TreeNode(0);
        Queue<TreeNode> queue = new LinkedList();
        if (root == null) {
            return 0;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            depth++;
            tempNode = queue.poll();
            if (tempNode.left == null && tempNode.right == null) {
                return depth;
            }
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
        return depth;
    }*/

    public static void main(String[] args) {
        TreeNode t = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
        s_111_Minimum_Depth_Binary_Tree s = new s_111_Minimum_Depth_Binary_Tree();
        System.out.println(s.minDepth(t));
    }
}
