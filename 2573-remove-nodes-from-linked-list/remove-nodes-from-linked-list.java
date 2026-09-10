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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next =prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        int max= Integer.MIN_VALUE;
        ListNode curr = reverse(head);
        ListNode newHead = curr;
        ListNode prev = null;
        
        while(curr!=null){
            if(curr.val>=max){
                max = curr.val;
                prev = curr;
            }else{
                prev.next =curr.next;
            }
            curr = curr.next;
        }
        return reverse(newHead);
    }
}