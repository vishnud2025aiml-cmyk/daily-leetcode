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
    public void reorderList(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;

        ListNode mid=null;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            mid=slow;
            fast=fast.next.next;
        }

        ListNode curr=slow.next;
        slow.next=null;

        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        while(head!=null && prev!=null){
            ListNode headnext=head.next;
            ListNode prevnext=prev.next;

            head.next=prev;
            prev.next=headnext;
            
            head=headnext;
            prev=prevnext;
        }

        
    }
}