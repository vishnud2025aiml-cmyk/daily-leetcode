class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res=0;
        long count=0;
        
        for(int x:nums){
            if(x==0){
                count++;
                res+=count;
            }
            else{
                count=0;
            }
        }
        return res;

        

    }
}