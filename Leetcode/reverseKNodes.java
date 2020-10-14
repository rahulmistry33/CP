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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = null; 
        ListNode current = head; 
        ListNode next = null;
        ListNode ans = null;
        ListNode curr = head;
        int i = 0; int flag = 0;
        int count = 0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        
        while(current!=null && i<k){          
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next;
            i++;
            count--;
        }
        
        if(current!=null && count>=k)
            head.next = reverseKGroup(current,k);
        else if(count<k)
            head.next = current;
        
        head = prev;   
        return head;
    }
}