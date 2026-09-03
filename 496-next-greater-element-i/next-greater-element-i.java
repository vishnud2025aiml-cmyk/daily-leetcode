class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> s=new Stack<>();
        for(int i=nums1.length-1;i>=0;i--){
            s.add(nums1[i]);
        }

        int[] res=new int[nums1.length];
        int index=0;

        while(!s.isEmpty()){
            int val=s.pop();
            int ans=-1;
            for(int i=nums2.length-1;i>=0;i--){
                if(val==nums2[i]){
                    break;
                }
                if(nums2[i]>val){
                    ans=nums2[i];
                    // System.out.println(ans);
                }

            }
            res[index++]=ans;
        }
        return res;
        
        
    }
}