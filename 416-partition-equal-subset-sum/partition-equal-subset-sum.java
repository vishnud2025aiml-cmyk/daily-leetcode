class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int x:nums){
            total+=x;
        }

        if(total%2!=0){
            return false;
        }
        int capacity=total/2;
        Boolean[][] dp=new Boolean[nums.length+1][capacity+1];

        return partition(0,nums,capacity,dp);


    }

    public boolean partition(int i,int[] nums,int capacity,Boolean[][] dp){
        if(i>=nums.length ||capacity<0){
            return false;
        }
        if(capacity==0){
            return true;
        }
        if(dp[i][capacity]!=null){
            return dp[i][capacity];
        }
        
        boolean skip=partition(i+1,nums,capacity,dp);
        boolean take=false;
        if(capacity>=nums[i]){
           take=partition(i+1,nums,capacity-nums[i],dp);
        }

        return dp[i][capacity]=skip || take;

    }

}