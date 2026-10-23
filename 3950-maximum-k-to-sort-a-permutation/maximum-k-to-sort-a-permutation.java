class Solution {
    public int sortPermutation(int[] nums) {
        int check=-1;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                if(check!=-1){
                    check=check&nums[i];
                }
                else{
                    check=nums[i];
                }
            }
        }
        if(check==-1){
            return 0;
        }
        return check;
    }
}