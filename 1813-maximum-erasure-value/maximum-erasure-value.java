class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        Map<Integer,Integer> mp=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int left=0;
        int sum=0;

        for(int right=0;right<nums.length;right++){
            int val=nums[right];
            
            mp.put(val,mp.getOrDefault(val,0)+1);
            while(mp.get(val)>1){
                int n=nums[left];
                sum-=n;
                mp.put(n,mp.getOrDefault(n,0)-1);
                if(mp.get(n)==0){
                    mp.remove(n);
                }
                left++;
            }
            sum+=val;
            max=Math.max(sum,max);
        }
        return max;

    }
}