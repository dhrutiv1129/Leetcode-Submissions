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
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }

        return pathSum(root.left, targetSum) + pathSum(root.right, targetSum) + helper(root, targetSum);


        
    }

    private int helper(TreeNode root, long remaining){
        if(root == null){
            return 0;
        }

        remaining = remaining - root.val;
        if(remaining == 0){
            return 1 + helper(root.right, remaining) + helper(root.left, remaining);
        }

        if(root.right == null && root.left == null && remaining != 0){
            return 0;
        }

        return helper(root.right, remaining) + helper(root.left, remaining);

    }
}