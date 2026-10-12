/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy  = new ListNode(0);
        dummy.next  = l1;
        ListNode prev = dummy;

        int carry = 0;
        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val +carry;
            
            l1.val = sum %10;
            carry = sum /10;

            prev = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1!=null){
            int sum = l1.val+carry;
            l1.val = sum %10;

            carry = sum /10;
            prev = l1;
            l1 = l1.next;
        }
        while(l2!=null){
            int sum = l2.val+carry;
            
            ListNode node = new ListNode(sum % 10);
            prev.next = node;
            prev = node;
            carry = sum /10;
            l2 = l2.next;
        }
        if(carry!=0){
            prev.next = new ListNode(carry);
        }
        return dummy.next;
    }
}