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
    public ListNode sortList(ListNode head) {

        ListNode curr = head;
        ListNode curr1 = head;
        int length =0 ;
        while(curr!=null){
            length++;
            curr = curr.next;
        }
        int [] arr = new int[length];
        int i =0;
        while(curr1!=null){
            arr[i] = curr1.val;
            i++;
            curr1 = curr1.next;
        }
        Arrays.sort(arr);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        for (int value : arr) {
            current.next = new ListNode(value);
            current = current.next;
        }
        
        return dummy.next;
    }
}