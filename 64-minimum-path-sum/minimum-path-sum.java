class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return path(grid,0,0,dp);

    }

    public int path(int[][] grid,int i,int j,int[][] dp){
        if(i>=grid.length || j>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        dp[i][j]=grid[i][j]+Math.min(path(grid,i+1,j,dp),path(grid,i,j+1,dp));
        return dp[i][j];
    }

}