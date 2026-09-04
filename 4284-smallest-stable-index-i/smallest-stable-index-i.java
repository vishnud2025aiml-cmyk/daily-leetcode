class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=0;
        int[] suffix=new int[nums.length];
        int min=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            suffix[i]=min;
            // System.out.println(suffix[i]);
        }

        int mx=0;
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
            if(mx-suffix[i]<=k){
                return i;
            }
        }

        return -1;


    }
}