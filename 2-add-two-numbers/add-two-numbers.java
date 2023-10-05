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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, temp1 = 0, temp2 = 0;
        ListNode head = new ListNode(0);
        ListNode l3 = head;
        
        while(l1 != null || l2 != null || carry == 1){
            temp1 = 0;
            temp2 = 0;
            
            if(l1 != null){
                temp1 = l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                temp2 = l2.val;
                l2 = l2.next;
            }
            
            
            l3.next = new ListNode();
            l3 = l3.next;
            
            if(temp1 + temp2 + carry > 9){
                l3.val = temp1 + temp2 + carry - 10;
                carry = 1;
            }
            else{
                l3.val = temp1 + temp2 + carry;
                carry = 0;
            }
            
            
        }
        

        return head.next;

        
    }
}