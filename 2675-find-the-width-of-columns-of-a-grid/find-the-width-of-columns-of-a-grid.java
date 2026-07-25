class Solution {
    public int[] findColumnWidth(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int[] res=new int[n];

        for(int i=0;i<n;i++){
            int len=0;
            for(int j=0;j<m;j++){
                String val=String.valueOf(grid[j][i]);
                len=Math.max(len,val.length());
                
            }
            res[i]=len;
        }
        return res;

    }
}