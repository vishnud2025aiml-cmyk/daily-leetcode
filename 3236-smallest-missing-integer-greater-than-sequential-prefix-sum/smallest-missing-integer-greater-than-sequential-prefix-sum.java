class Solution {
    public int missingInteger(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();

        for(int x:nums){
            mp.put(x,0);
        }

        int sum=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            
            else{
                break;
            }
        }
        while(mp.get(sum)!=null){
            sum+=1;
        }
        return sum;


    }
}