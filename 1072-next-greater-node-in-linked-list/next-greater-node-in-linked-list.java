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
    public int[] nextLargerNodes(ListNode head) {
        
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        ListNode temp=prev;

        Stack<Integer> s=new Stack<>();
        List<Integer> arr=new ArrayList<>();
        while(temp!=null){
            s.push(temp.val);
            arr.add(temp.val);
            temp=temp.next;
        }

        int k=0;
        int j=0;
        int[] res=new int[arr.size()];
        while(!s.isEmpty()){
            int val=s.pop();
            boolean ans=true;
            for(int i=arr.size()-2-k;i>=0;i--){
                int check=arr.get(i);
                if(val<check && ans){
                    res[j++]=check;
                    ans=false;
                    break;
                }
            }
            if(ans==true){
                res[j++]=0;
            }
            k++;
        }

        return res;

    }
}