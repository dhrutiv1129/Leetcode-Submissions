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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean swap = false;
         List<List<Integer>> traversal = new ArrayList<>();
        if(root == null){
            return traversal;
        }
       
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> l = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if(node.left != null){
                    q.offer(node.left);
                }
                
                if(node.right != null){
                    q.offer(node.right);
                }
               
                l.add(node.val);    

            }
            if(swap){
                Collections.reverse(l);
            }
            traversal.add(l);
            swap = !swap;
        }



      return traversal; 

        
    }

    
}