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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // remove elem in list1
        ListNode curr = list1;
        ListNode curr2 = list2;
        
        while(curr2!=null && curr2.next!=null){
            curr2 = curr2.next;
        }

        int length =1 ;
        while(curr !=null && curr!=null){
            if(length>=a && length <=b){
                curr.next= curr.next.next;
            }else{
                curr = curr.next;
            }
            length++;
        }
        ListNode curr1 = list1;
        int i =1;
        while(curr1!=null){
            if(i==a){
                ListNode pres = curr1.next;
                curr1.next = list2;
                curr2.next = pres;
            }else{
                curr1 = curr1.next;
            }
            i++;
        }

        return list1;
    }
}