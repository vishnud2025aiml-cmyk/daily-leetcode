class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int max=0;
        for(int x:nums){
            max=Math.max(x,max);
        }
        int[] freq=new int[max+1];
        for(int x:nums){
            freq[x]++;
        }

        int mid=nums.length/2;
        if(freq[nums[mid]]>1){
            return false;
        }
        return true;

    }
}