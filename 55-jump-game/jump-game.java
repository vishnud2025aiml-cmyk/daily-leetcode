class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;

        // Boolean[] dp=new Boolean[n];
        // return jump(0,nums,dp);
        int max=0;
        for(int i=0;i<n;i++){
            if(i>max){
                return false;
            }

            if(max>=n-1){
                return true;
            }
            max=Math.max(max,i+nums[i]);
        }
        return true;

    }

    // public boolean jump(int idx,int[] nums,Boolean[] dp){
    //     if(idx>=nums.length-1){
    //         return true;
    //     }
    //     if(dp[idx]!=null){
    //         return dp[idx];
    //     }
    //     for(int i=idx;i<=idx+nums[idx];i++){
    //         if(jump(i+1,nums,dp)){
    //             dp[idx]=true;
    //             return true;
    //         }
            
    //     }
    //     dp[idx]=false;
    //     return dp[idx];
    // }

}