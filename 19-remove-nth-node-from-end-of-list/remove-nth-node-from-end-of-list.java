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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr1 = head;
        ListNode curr = head;
        int length = 0;
        while(curr!=null){
            length++;
            curr = curr.next;
        }
        if(n==length){
            return head.next;
        }
        int position = length-n;
        int i = 0;
        while(curr1!=null && curr1.next !=null){
            i++;
            if(i==position){
                curr1.next = curr1.next.next;
            }else{
                curr1 = curr1.next;
            }
        }
        return head;
    }
}