class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((grid[i][j]==1) && i==0 || j==0 || i==m-1 || j==n-1){
                    dfs(i,j,grid,visited);
                }
            }
        }

        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    count++;
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