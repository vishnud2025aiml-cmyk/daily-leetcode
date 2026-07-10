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
        
        ListNode curr=head;
        ListNode res=new ListNode(0);
        ListNode dummy=res;

        while(curr!=null){
            
            if(curr.next!=null && curr.next.val==curr.val){
                int num=curr.val;
                while(curr!=null && curr.val==num){
                    curr=curr.next;
                }
            }
            else{
                res.next=new ListNode(curr.val);
                res=res.next;
                curr=curr.next;
            }
        }

        return dummy.next;

    }
}