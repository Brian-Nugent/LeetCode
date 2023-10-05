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
        ListNode curr = head;
        ListNode nAhead = head;
        
        if(head.next == null){
            head = null;
            return head;
        }
        
        for(int i = 0; i < n; i++)
            nAhead = nAhead.next;
        
        if(nAhead == null)
            return head.next;
        
        while(!(nAhead.next == null)){
            curr = curr.next;
            nAhead = nAhead.next;
        }
        
        curr.next = (curr.next).next;
        
        
    return head;
    }
}