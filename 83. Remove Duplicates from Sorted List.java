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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr= head;
        // here trvelling through out the all elements
        while( curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next= curr.next.next;
                // just checking with next element and making a connection with them 
                
            }
            else{
                curr= curr.next;
// otherwise just go one step ahead normally 

            }

        }
        return head;
    }
}
