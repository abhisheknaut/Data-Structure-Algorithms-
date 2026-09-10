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
 // ********************** steps****************

 // 1. track the prev value of k  2. 1.next -->length && 3.next = k 
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        // convert list to arrayList
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        int length = 0 ;
        while (curr != null) {
            arr.add(curr.val);
            length ++;
            curr = curr.next;
        }
        // calculating the length 
        length = length - k;
        // swap as array element
        int temp = arr.get(k-1);
        arr.set(k-1 , arr.get(length));
        arr.set(length ,temp);

        // convert to the linked list
        ListNode dummy = new ListNode(0);
        ListNode furr = dummy;

        for (int value : arr) {
            furr.next = new ListNode(value);
            furr = furr.next;
        }
        return dummy.next;
    }
}