class Solution {
    int dp[];
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        for(int i=0;i<cost.length;i++){
            dp[i]=-1;
        }

        return Math.min(solve(cost,0),solve(cost,1));
    }

    public int solve(int[] cost,int idx){
        if(idx>=cost.length){
            return 0;
        }

        if(dp[idx]!=-1){
            return dp[idx];
        }
        
        dp[idx]=cost[idx]+Math.min(solve(cost,idx+1),solve(cost,idx+2));
        return dp[idx];
    }

}