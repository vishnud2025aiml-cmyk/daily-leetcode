class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int index=0;
        int max_one=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>max_one){
                max_one=count;
                index=i;
            }
        }
        return new int[]{index,max_one};
    }
}