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
    public ListNode removeElements(ListNode head, int val) {
        // first of all i will create a listnode 
        ListNode dummy= new ListNode(0);
        dummy.next= head; // here creating one dummy node at the start and connect with head 
        ListNode prev= dummy; // this is moving node in the ListNode not dummy node is movig
        ListNode curr= head; // here showing head == dummy 

        while(curr!=null){
            // move this loop till the end 
            if(curr.val == val){
                prev.next= curr.next;
                // making a connection 

            }
            else{
                prev= curr; 
                // otherwise let it go
            }
            curr= curr.next;
            // keep moving till the end;
        }

            return dummy.next;
            // at starting we have a empty node connect with head means where curr head is pointed from that point list will countinue;
            // see i have put prev= cur same for both situation 
        
    }
}
