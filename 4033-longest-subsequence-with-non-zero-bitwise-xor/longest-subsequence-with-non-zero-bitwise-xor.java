class Solution {
    public int longestSubsequence(int[] nums) {
        
        int val=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            val^=nums[i];
        }

        if(val!=0){
            return n;
        }

        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                return n-1;
            }
        }

        return 0;
        

    }
}