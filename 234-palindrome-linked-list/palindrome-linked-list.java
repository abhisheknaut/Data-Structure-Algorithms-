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
    public boolean isPalindrome(ListNode head) {
        ListNode slow =head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode rev = slow;
        ListNode prev = null;

        while(rev !=null){
            ListNode next = rev.next;
            rev.next = prev;
            prev = rev;
            rev = next;
        }
        ListNode a = prev;
        ListNode b = head;
        while(b !=null && a!=null){
            if(a.val!=b.val){
                return false;
            }
            a= a.next;
            b = b.next;
        }
        return true;
    }
}