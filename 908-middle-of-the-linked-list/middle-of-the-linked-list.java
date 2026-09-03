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
    public ListNode middleNode(ListNode head) {
        int length = 0 ; 
        ListNode curr = head;
        while(curr!=null){
            length++;
            curr = curr.next;
        }
        length = length /2;
        for (int i = 0; i < length; i++) {
            head = head.next;
        }
        return head;
    }
}