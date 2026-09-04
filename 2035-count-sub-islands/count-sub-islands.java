class Solution {
    boolean check=true;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m=grid2.length;
        int n=grid2[0].length;
        int count=0;

        boolean[][] visited=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid2[i][j]==1 && !visited[i][j]){
                    dfs(i,j,grid2,grid1,visited);
                    if(check){
                        count++;
                    }
                    check=true;
                }
            }
        }

        return count;

    }

    public void dfs(int x,int y,int[][] grid2,int[][] grid1,boolean[][] visited){
        if(!safe(x,y,grid2)){
            return ;
        }
        if(grid2[x][y]==0 || visited[x][y]){
            return ;
        }
        if(grid1[x][y]!=1){
            check=false;
        }
        visited[x][y]=true;

        dfs(x-1,y,grid2,grid1,visited);
        dfs(x+1,y,grid2,grid1,visited);
        dfs(x,y-1,grid2,grid1,visited);
        dfs(x,y+1,grid2,grid1,visited);
    }

    public boolean safe(int x,int y,int[][] grid){
        if(x>=0 && x<grid.length && y>=0 && y<grid[0].length){
            return true;
        }
        return false;
    }

}