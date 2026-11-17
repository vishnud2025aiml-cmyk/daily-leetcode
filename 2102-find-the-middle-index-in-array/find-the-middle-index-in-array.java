class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }

        int right=0;
        for(int i=1;i<nums.length;i++){
            right+=nums[i];
        }
        if(right==0){
            return 0;
        }

        int left=0;
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            right=0;
            for(int j=i+2;j<nums.length;j++){
                right+=nums[j];
            }
            if(left==right){
                return i+1;
            }
        }
        
        return -1;
    }
}