class Solution {
    int x1;
    int y1;
    public int[][] findFarmland(int[][] land) {
        int m=land.length;
        int n=land[0].length;

        boolean[][] visited=new boolean[m][n];

        List<int[]> res=new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(land[i][j]==1 && !visited[i][j]){
                    x1=i;
                    y1=j;
                    dfs(i,j,land,visited);

                    int[] ans=new int[]{i,j,x1,y1};

                    res.add(ans);
                }
            }
        }


        int[][] ans=new int[res.size()][4];

        for(int i=0;i<res.size();i++){
            ans[i][0]=res.get(i)[0];
            ans[i][1]=res.get(i)[1];
            ans[i][2]=res.get(i)[2];
            ans[i][3]=res.get(i)[3];
        }

        return ans;

    }

    public void dfs(int x,int y,int[][] land,boolean[][] visited){
        if(!safe(x,y,land)){
            return ;
        }
        if(land[x][y]!=1 || visited[x][y]){
            return ;
        }
        x1=Math.max(x,x1);
        y1=Math.max(y,y1);
        visited[x][y]=true;

        dfs(x+1,y,land,visited);
        dfs(x-1,y,land,visited);
        dfs(x,y+1,land,visited);
        dfs(x,y-1,land,visited);

    }

    public boolean safe(int x,int y,int[][] land){
        if(x>=0 && x<land.length && y>=0 && y<land[0].length){
            return true;
        }
        return false;
    }

}