class Solution {
    public String stoneGameIII(int[] stoneValue) {
        
        int[] dp=new int[stoneValue.length];
        Arrays.fill(dp,Integer.MIN_VALUE);

        int val=stone(stoneValue,0,dp);
        if(val==0){
            return "Tie";
        }
        if(val>0){
            return "Alice";
        }
        else{
            return "Bob";
        }
    }

    public int stone(int[] nums,int idx,int[] dp){
        if(idx>=nums.length){
            return 0;
        }
        
        if(dp[idx]!=Integer.MIN_VALUE){
            return dp[idx];
        }
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        if(idx<nums.length){
            first=nums[idx]-stone(nums,idx+1,dp);
        }
        if(idx+1<nums.length){
            second=nums[idx]+nums[idx+1]-stone(nums,idx+2,dp);
        }
        if(idx+2<nums.length){
            third=nums[idx]+nums[idx+1]+nums[idx+2]-stone(nums,idx+3,dp);
        }

        dp[idx]=Math.max(first,Math.max(second,third));
        return dp[idx];

    }

}