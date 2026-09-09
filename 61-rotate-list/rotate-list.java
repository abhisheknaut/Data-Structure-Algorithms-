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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr =head;
        int length = 0;

        while(curr!=null){
            length++;
            curr = curr.next;
        }
        if(length ==0){
            return head;
        }
        k = k % length;

        if(k == 0){
            return head;
        }

        curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }

        curr.next = head;
        ListNode newTail = head;

        for(int i=0;i< length-k-1;i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        head= newHead;
        return head;
    }
}