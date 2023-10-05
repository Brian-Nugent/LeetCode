/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int sumFunc(TreeNode root, boolean left){
        if(root == null)
            return 0;
        
        if(left && root.left == null && root.right == null)
            return root.val;
        
        return sumFunc(root.left, true) + sumFunc(root.right, false);
        
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        
        return sumFunc(root, false);
        
    }
}