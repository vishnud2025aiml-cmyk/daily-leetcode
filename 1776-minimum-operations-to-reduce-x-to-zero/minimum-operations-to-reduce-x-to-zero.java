class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int n:nums){
            total+=n;
        }
        int target=total-x;
        if(target==0){
            return nums.length;
        }
        int sum=0;
        int left=0;
        int res=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>target && left<=right){
                sum-=nums[left++];
            }
            if(sum==target){
                res=Math.max(res,right-left+1);
            }
        }
        if(res==0){
            return -1;
        }
        return nums.length-res;
    }
}