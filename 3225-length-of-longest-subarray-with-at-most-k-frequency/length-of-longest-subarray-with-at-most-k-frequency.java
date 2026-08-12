class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();

        int left=0;
        int max=Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            while(mp.get(nums[right])>k){
                int val=nums[left];
                mp.put(val,mp.getOrDefault(val,0)-1);
                if(mp.get(val)==0){
                    mp.remove(val);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;

    }
}