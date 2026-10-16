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

        return rem(root, targetSum) + pathSum(root.right, targetSum) + pathSum(root.left, targetSum);

        
    }

    private int rem(TreeNode root, long remaining){
        if(root == null){
            return 0;
        }
        int count;

        if(root.val == remaining){
            count = 1;

        } else {
            count = 0;
        }

        count += rem(root.right, remaining - root.val);
        count += rem(root.left, remaining - root.val);


        return count;

       


    }
}