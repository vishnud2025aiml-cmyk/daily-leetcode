class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        for(int i=0;i<k;i++){
            grid=shift(grid);
        }

        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            res.add(new ArrayList<>());
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                res.get(i).add(grid[i][j]);
            }
        }

        return res;

    }

    public int[][] shift(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        int[][] temp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i<m && j+1<n){
                    temp[i][j+1]=grid[i][j];
                }
                else if(i+1<m && j<=n-1){
                    temp[i+1][0]=grid[i][n-1];
                }
                else if(i<=m-1 && j<=n-1){
                    temp[0][0]=grid[m-1][n-1];
                }
            }
        }
        return temp;
    }

}