class Solution {
    public int peakValleyDifference(int[] nums) {
        int peek=0;
        int valley=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                peek+=nums[i];
            }
            if(nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                valley+=nums[i];
            }
        }
        return peek-valley;
    }
}