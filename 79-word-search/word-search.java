class Solution {
    public boolean exist(char[][] board, String word) {
        
        int m=board.length;
        int n=board[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0) && !visited[i][j]){
                    StringBuilder s=new StringBuilder();
                    if(dfs(board,i,j,0,word,s,visited)){
                        return true;
                    }
                    
                }
            }
        }
        return false;

    }

    public boolean dfs(char[][]board,int x,int y,int idx,String word,StringBuilder s,boolean[][] visited){
        if(!safe(x,y,board)){
            return false;
        }

        if(board[x][y]!=word.charAt(idx) || visited[x][y]==true){
            return false;
        }

        visited[x][y]=true;
        s.append(board[x][y]);
        if(s.toString().equals(word)){
            return true;
        }
        
        boolean found=dfs(board,x-1,y,idx+1,word,s,visited) ||
                        dfs(board,x+1,y,idx+1,word,s,visited) ||
                        dfs(board,x,y-1,idx+1,word,s,visited) ||
                        dfs(board,x,y+1,idx+1,word,s,visited);
        visited[x][y]=false;
        s.deleteCharAt(s.length()-1);
        return found;

    }

    public boolean safe(int x,int y,char[][] board){
        if(x>=0 && x<board.length && y>=0 && y<board[0].length){
            return true;
        }
        return false;
    }

}