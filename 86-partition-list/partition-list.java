/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 // with sequnce -->first ---> smaller than x + second ---> greater and equal 
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode greater = new ListNode(0);
        ListNode below = less;
        ListNode above= greater;
        ListNode curr = head;

        while(curr!=null){
            if(curr.val < x){
                below.next = curr;
                below = below.next;
            }else{
                above.next =curr;
                above = above.next;
            }
            curr = curr.next;
        }
        above.next = null;
        below.next = greater.next;
        return less.next;
    }
}