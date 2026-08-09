class Solution {
    public int triangularSum(int[] nums) {

        while(nums.length>1){
            int[] ans=new int[nums.length-1];
            for(int i=0;i<nums.length-1;i++){
                int val=(nums[i]+nums[i+1])%10;
                ans[i]=val;
            }
            nums=ans;
        }
        return nums[0];
    }
}