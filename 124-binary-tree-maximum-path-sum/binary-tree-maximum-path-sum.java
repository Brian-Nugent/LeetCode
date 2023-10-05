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
    public int max(int a, int b, int c){
        if(a > b && a > c)
            return a;
        if(b > c)
            return b;
        return c;
    }
    
    public int travTree(TreeNode root, int currSum, int[] currMax){
        if(root == null)
            return 0;
        
        int a = travTree(root.left, 0, currMax);
        int b = travTree(root.right, 0, currMax);
        
        if(a + b + root.val > currMax[0])
            currMax[0] = a+b+root.val;
        
        
        
        return max(0, currSum + a + root.val, currSum + b + root.val);
        
    }
    
    public int maxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        
        int[] currMax = new int[] {root.val};
        
        int a = travTree(root, 0, currMax);
        
        return currMax[0];
        
    }
}