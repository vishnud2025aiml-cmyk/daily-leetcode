class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        
        int[] check=new int[nums.length];
        check[0]=0;
        for(int i=1;i<nums.length;i++){
            check[i]=check[i-1];
            if(nums[i-1]%2==0 && nums[i]%2==0){
                check[i]++;
            }
            if(nums[i-1]%2==1 && nums[i]%2==1){
                check[i]++;
            }
        }

        boolean[] res=new boolean[queries.length];
        int index=0;
        for(int[] query:queries){
            int l=query[0];
            int r=query[1];
            int val=check[r]-check[l];
            if(val>=1){
                res[index++]=false;
            }
            else{
                res[index++]=true;
            }
            
        }
        return res;

    }
}