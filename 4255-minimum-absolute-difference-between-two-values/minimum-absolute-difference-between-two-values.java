class Solution {
    public int minAbsoluteDifference(int[] nums) {
        
        int ones=-1;
        int twos=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ones=i;
            }
            if(nums[i]==2){
                twos=i;
            }
            if(ones!=-1 && twos!=-1){
                min=Math.min(min,Math.abs(ones-twos));
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;

    }
}