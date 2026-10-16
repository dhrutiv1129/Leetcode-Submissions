class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode sum = dummy;

        while(l1 != null || l2 != null) {
            if(l1 == null){
                l1 = new ListNode(0);
            } else if(l2 == null){
                l2 = new ListNode(0);
            }

            if(l1.val + l2.val + carry >= 10){
                System.out.println(l1.val + l2.val + carry);
                System.out.println((l1.val + l2.val + carry) % 10);

                sum.next = new ListNode((l1.val + l2.val + carry) % 10);
                carry = 1;
            } else {
                System.out.println(l1.val + l2.val + carry);
                sum.next = new ListNode(l1.val + l2.val + carry);
                carry = 0;
            }

            sum = sum.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if (carry == 1) {
    sum.next = new ListNode(1);
}

        return dummy.next;
    }
}