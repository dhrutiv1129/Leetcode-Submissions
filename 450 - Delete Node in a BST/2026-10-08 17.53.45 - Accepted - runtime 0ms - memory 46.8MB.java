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
    public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null){
            return root;
        }

        if(root.val == key){
            if(root.right == null && root.left == null){
                return null;
            } if(root.right == null){
                return root.left;
            } if(root.left == null){
                return root.right;
            }

             TreeNode successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            root.val = successor.val;
            root.right = deleteNode(root.right, root.val);
        
       

            
            

        

        }
        if(key < root.val){
                root.left = deleteNode(root.left, key);
            }
            if(key > root.val){
                root.right = deleteNode(root.right, key);
            }
        return root;
       

        
        // traverse till we find the key
        // record right and left side
        // make root left / right side the left, add the next one to right
        
    
}

}