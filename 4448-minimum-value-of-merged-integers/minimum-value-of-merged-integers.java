class Solution {
    public int minMergedInteger(int[] nums) {
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i+=2){
            String ans=Integer.toString(nums[i])+Integer.toString(nums[i+1]);
            res=Math.min(res,Integer.parseInt(ans));
        }
        return res;
    }
}