package Solutions;

import java.util.LinkedList;
import java.util.Queue;

public class s111_Minimum_Depth_Binary_Tree {
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
            int counter=0;
            if(root==null){
                return 0;
            }
            Queue<TreeNode> queue = new LinkedList();
            queue.add(root);
            while(!queue.isEmpty()){
                TreeNode tempNode= queue.poll();
                if(tempNode.left==null && tempNode.right==null){
                    return counter;
                }else {
                    if(tempNode.left!=null){
                        queue.add(tempNode.left);
                    }
                    if(tempNode.right!=null){
                        queue.add(tempNode.right);
                    }
                    counter++;
                }
            }
            return counter;
        }
        
    public static void main(String[] args) {
        TreeNode t = new TreeNode(3,new TreeNode(9,null,null),new TreeNode(20,new TreeNode(15,null,null),new TreeNode(7,null,null)));
        s111_Minimum_Depth_Binary_Tree s = new s111_Minimum_Depth_Binary_Tree();
        s.minDepth(t);
    }
}
