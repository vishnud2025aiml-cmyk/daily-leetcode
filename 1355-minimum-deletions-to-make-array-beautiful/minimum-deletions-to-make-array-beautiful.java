class Solution {
    public int minDeletion(int[] nums) {
        int del=0;
        for(int i=0;i<nums.length-1;i++){
            if((i-del)%2==0 && nums[i]==nums[i+1]){
                del++;
            }
        }
        if((nums.length-del)%2==1){
            del++;
        }
        return del;
    }
}