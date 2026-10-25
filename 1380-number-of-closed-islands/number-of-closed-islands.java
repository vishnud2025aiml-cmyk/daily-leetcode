class Solution {
    List<int[]> ans=new ArrayList<>();
    public int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    if(dfs(i,j,grid)){
                        count++;
                    }
                    
                }
            }
        }
        return count;
    }

    public boolean dfs(int x,int y,int[][] grid){
        if(!safe(x,y,grid)){
            return false;
        }
        if(grid[x][y]==1){
            return true;
        }
        grid[x][y]=1;
        boolean down=dfs(x+1,y,grid);
        boolean up=dfs(x-1,y,grid);
        boolean right=dfs(x,y+1,grid);
        boolean left=dfs(x,y-1,grid);
        return down && up && right && left;
    }

    public boolean safe(int x,int y,int[][] grid){
        if(x>=0 && x<grid.length && y>=0 && y<grid[0].length){
            return true;
        }
        return false;
    }

}