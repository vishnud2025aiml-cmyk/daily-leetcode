class Solution {
    public long countSubarrays(int[] nums, int k) {
        
        int max=0;
        for(int x:nums){
            if(x>max){
                max=x;
            }
        }

        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(max,0);
        int left=0;
        long count=0;
        for(int right=0;right<nums.length;right++){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            while(mp.get(max)>=k){ 
                count+=(long)nums.length-right;
                mp.put(nums[left],mp.get(nums[left])-1);
                left++;
            }
        }
        return count;


    }
}