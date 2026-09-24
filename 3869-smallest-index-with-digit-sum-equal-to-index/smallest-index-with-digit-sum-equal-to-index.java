class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int total=0;
            while(n>0){
                total+=n%10;
                n/=10;
            }
            if(total==i){
                return i;
            }
        }
        return -1;
    }
}