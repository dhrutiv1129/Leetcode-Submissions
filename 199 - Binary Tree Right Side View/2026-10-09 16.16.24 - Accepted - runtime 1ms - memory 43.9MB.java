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
    List<Integer> l = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return l;
        }

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
       
        while(!q.isEmpty()){
            List<Integer> current = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                current.add(node.val);
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }

                

            }
            l.add(current.get(size - 1));
        }

    

        return l;



}
}