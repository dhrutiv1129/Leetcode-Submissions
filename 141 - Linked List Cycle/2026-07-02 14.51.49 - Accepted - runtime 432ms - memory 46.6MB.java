/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        
        ListNode curr = head;
        Stack<ListNode> stack = new Stack<>();
        while(curr.next != null){
            if(stack.contains(curr)){
                return true;
            }
            stack.push(curr);
            curr = curr.next;



        }
    return false;
        
    }
}