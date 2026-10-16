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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        if(root.right == null && root.left == null){
            return true;
        }

        if(root.right == null || root.left == null){
            return false;
        }

        return isMirror(root.right, root.left);
}
    private boolean isMirror(TreeNode right, TreeNode left){
        if(right == null && left == null){
            return true;
        }
        if(right == null || left == null){
            return false;
        }
        if(right.val != left.val){
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);

    }
}