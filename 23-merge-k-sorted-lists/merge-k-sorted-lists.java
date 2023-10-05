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
        
        ListNode head = null;
        ListNode curr = null;
        int small = 0;
        int smallVal = Integer.MAX_VALUE;
        boolean allEmpty = true;
        
        for(int i = 0; i < lists.length; i++){
            if(lists[i] != null && lists[i].val < smallVal){
                small = i;
                smallVal = lists[i].val;
                allEmpty = false;
            }
        }
        
        if(allEmpty)
            return head;
        
        head = lists[small];
        curr = head;
        lists[small] = lists[small].next;
        
        while(!allEmpty){
            allEmpty = true;
            smallVal = Integer.MAX_VALUE;
            small = 0;
            for(int i = 0; i < lists.length; i++){
                if(lists[i] != null && lists[i].val < smallVal){
                    small = i;
                    smallVal = lists[i].val;
                    allEmpty = false;
                }
            }
            curr.next = lists[small];
            curr = curr.next;
            
            if(!allEmpty){
                lists[small] = lists[small].next;
            }
            
        }
        
        return head;
        
    }
}