class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        List<Integer> row_max=new ArrayList<>();
        List<Integer> col_max=new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;

        for(int i=0;i<m;i++){
            int max=0;
            for(int j=0;j<n;j++){
                if(max<grid[i][j]){
                    max=grid[i][j];
                }
            }
            row_max.add(max);
        }

        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<m;j++){
                if(max<grid[j][i]){
                    max=grid[j][i];
                }
            }
            col_max.add(max);
        }

        int total=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int ans=Math.min(row_max.get(i),col_max.get(j));
                total+=ans-grid[i][j];
            }
        }
        return total;

    }
}