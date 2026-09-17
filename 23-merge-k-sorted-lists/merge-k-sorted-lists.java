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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i =0 ;i <lists.length;i++){
            ListNode curr = lists[i];

            while(curr !=null){
                arr.add(curr.val);
                curr = curr.next;
            }
        }
        arr.sort(null);
        ListNode ans = new ListNode(0);
        ListNode oho = ans;
        for(int i =0 ;i<arr.size();i++){
            ans.next = new ListNode(arr.get(i)); 
            ans =ans.next;
        }
        return oho.next;
    }
}