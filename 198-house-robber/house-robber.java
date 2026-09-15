class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return robber(nums,0,dp);
    
    }

    public int robber(int[] nums,int idx,int[] dp){
        if(idx>=nums.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int skip=robber(nums,idx+1,dp);
        int take=0;
        if(idx<nums.length){
            take=nums[idx]+robber(nums,idx+2,dp);
        }

        dp[idx]=Math.max(take,skip);

        return dp[idx];

    }

}