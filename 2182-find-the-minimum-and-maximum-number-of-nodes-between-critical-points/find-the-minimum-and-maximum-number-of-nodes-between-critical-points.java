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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        List<Integer> ans=new ArrayList<>();

        ListNode temp=head;
        int prev=temp.val;
        int len=0;

        while(temp.next!=null){
            if(len!=0){
                if(temp.val>prev && temp.val>temp.next.val){
                    ans.add(len+1);
                }
                if(temp.val<prev && temp.val<temp.next.val){
                    ans.add(len+1);
                }
                
            }
            prev=temp.val;
            len++;
            temp=temp.next;
        }

        // for(int i=0;i<ans.size();i++){
        //     System.out.println(ans.get(i));
        // }

        int[] res={-1,-1};

        if(ans.size()<=1){
            return res;
        }

        int min=Integer.MAX_VALUE;
        for(int i=1;i<ans.size();i++){
            min=Math.min(min,ans.get(i)-ans.get(i-1));
        }
        int max=ans.get(ans.size()-1)-ans.get(0);
        res[0]=min;
        res[1]=max;

        return res;

    }
}