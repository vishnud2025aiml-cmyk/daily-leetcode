class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n=triangle.size();
        Integer[][] dp=new Integer[n][n];
        return traverse(0,0,triangle,dp);

    }

    public int traverse(int idx,int row,List<List<Integer>> mat,Integer[][] dp){
        if(row>=mat.size()){
            return 0;
        }

        if(dp[row][idx]!=null){
            return dp[row][idx];
        }
        
        int left=traverse(idx,row+1,mat,dp);
        int right=traverse(idx+1,row+1,mat,dp);
        
        dp[row][idx]=mat.get(row).get(idx)+Math.min(left,right);

        return dp[row][idx];

    }

}