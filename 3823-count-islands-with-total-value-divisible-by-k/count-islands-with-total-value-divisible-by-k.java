class Solution {
    long total=0;
    public int countIslands(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;

        boolean[][] visited=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0 && !visited[i][j]){
                    dfs(i,j,grid,visited);
                    if(total%k==0){
                        count++;
                    }
                    total=0;
                }
            }
        }
        return count;

    }

    public void dfs(int x,int y,int[][] grid,boolean[][] visited){
        if(!safe(x,y,grid)){
            return ;
        }
        if(grid[x][y]==0 || visited[x][y]){
            return ;
        }
        visited[x][y]=true;
        total+=grid[x][y];

        dfs(x-1,y,grid,visited);
        dfs(x+1,y,grid,visited);
        dfs(x,y-1,grid,visited);
        dfs(x,y+1,grid,visited);
    }

    public boolean safe(int x,int y,int[][] grid){
        if(x>=0 && x<grid.length && y>=0 && y<grid[0].length){
            return true;
        }
        return false;
    }

}