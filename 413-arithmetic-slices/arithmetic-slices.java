class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        
        int left=0;
        int diff=nums[1]-nums[0];
        int count=0;
        for(int right=1;right<nums.length;right++){
            if(nums[right]-nums[right-1]!=diff){
                diff=nums[right]-nums[right-1];
                left=right-1;
            }
            int len=right-left+1;
            // System.out.println(len);
            if(len>=3){
                count+=len-2;
            }
            

        }
        return count;

    }
}