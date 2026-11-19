class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        
        boolean[] res=new boolean[queries.length];

        int[] ans=new int[n];
        int check=0;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]>maxDiff){
                check++;
            }
            ans[i]=check;
        }
        int index=0;
        for(int[] x:queries){
            if(ans[x[0]]==ans[x[1]]){
                res[index]=true;
            }
            index++;
        }

        return res;

    }
}