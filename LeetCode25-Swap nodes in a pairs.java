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
    public ListNode swapPairs(ListNode head) {
        ListNode curr= head;
        ListNode nextnode= head;
        // here i have created the nextnode dummy for storing prev used as dummy and 
        ListNode dummy= new ListNode(0);
        ListNode prev= dummy;
        dummy.next= head;

        while(curr!=null && curr.next!=null){
             nextnode= curr.next;
            
            curr.next=nextnode.next;
            // cut first interactions

            nextnode.next= curr;

            // second element with connect one 
            prev.next= nextnode;

            // connect this with prev in starting we can say with 0
           

            prev=curr;

            // make prev is = to curr changing for the next pair

            curr= curr.next;

            // moving in the loop for next pair 

        }
        

        return dummy.next;

        
    }
}Lee
