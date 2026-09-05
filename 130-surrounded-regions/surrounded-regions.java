class Solution {
    public void solve(char[][] board) {

        int m=board.length;
        int n=board[0].length;

        boolean[][] visited=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((board[i][j]=='O') && (i==0 || j==0 || i==m-1 || j==n-1)){
                    dfs(i,j,board,visited);
                }
                
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    board[i][j]='X';
                }
            }
        }

    }

    public void dfs(int x,int y,char[][] board,boolean[][] visited){
        if(!safe(x,y,board)){
            return ;
        }
        if(board[x][y]!='O' || visited[x][y]){
            return;
        }
        
        // System.out.println(x+ " " +y);
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