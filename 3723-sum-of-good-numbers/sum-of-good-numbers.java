class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            boolean good=true;
            if(i-k>=0 && i-k<nums.length){
                if(nums[i-k]>=nums[i]){
                    good=false;
                }
            }
            if(i+k>=0 && i+k<nums.length){
                if(nums[i+k]>=nums[i]){
                    good=false;
                }
            }
            if(good){
                sum+=nums[i];
            }
        }
        return sum;
    }
}