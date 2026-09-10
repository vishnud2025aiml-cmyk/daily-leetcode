class Solution {
    public int coinChange(int[] coins, int amount) {

        int n=coins.length;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);

        int res=coin(amount,coins,dp);
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
        
    }

    public int coin(int amount,int[] coins,int[] dp){
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int res=Integer.MAX_VALUE; 
        for(int x:coins){
            int curr=coin(amount-x,coins,dp);
            if(curr!=Integer.MAX_VALUE){
                res=Math.min(res,curr+1);
            }
        }
        dp[amount]=res;
        return dp[amount];

    }

}