class Solution {
    public int[][] largestLocal(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] res=new int[m-2][n-2];
        for(int i=0;i<m-2;i++){
            for(int j=0;j<n-2;j++){
                res[i][j]=largest(i,j,grid);
            }
        }
        return res;
    }
    public int largest(int m,int n,int[][] grid){
        int max=Integer.MIN_VALUE;
        for(int i=m;i<m+3;i++){
            for(int j=n;j<n+3;j++){
                max=Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
}