class Solution {
    public int countBattleships(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int count=0;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='X' && !visited[i][j]){
                    dfs(i,j,board,visited);
                    // System.out.println(board[i][j]);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int x,int y,char[][] board,boolean[][] visited){
        if(!safe(x,y,board)){
            return ;
        }
        if(board[x][y]=='.' || visited[x][y]){
            return ;
        }
        visited[x][y]=true;

        dfs(x-1,y,board,visited);
        dfs(x+1,y,board,visited);
        dfs(x,y-1,board,visited);
        dfs(x,y+1,board,visited);

    }
    
    public boolean safe(int x,int y,char[][] board){
        if(x>=0 && x<board.length && y>=0 && y<board[0].length){
            return true;
        }
        return false;
    }

}