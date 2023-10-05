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
    public void buildList(TreeNode root, int targetSum, List<Integer> tempList, List<List<Integer>> list){
        if(root == null)
            return;
        
        tempList.add(root.val);
        
        if(root.left == null && root.right == null && root.val == targetSum)
            list.add(tempList);
        
        buildList(root.left, targetSum-root.val, new ArrayList<Integer>(tempList), list);
        buildList(root.right, targetSum-root.val, new ArrayList<Integer>(tempList), list);
        
        return;
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        buildList(root, targetSum, new ArrayList<Integer>(), list);
            
        return list;
        
    }
}