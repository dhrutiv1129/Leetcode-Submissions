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
    int m = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        // get max depth on both sides
        // add together
        // claclulate at each node
        // store in a max variable
      
        // calculate the max depths
        maxDepth(root);
        return m;    
    }

    private int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int currentDiameter = left + right;
        m = Math.max(currentDiameter, m);
        return Math.max(left,right) + 1;
    }
}