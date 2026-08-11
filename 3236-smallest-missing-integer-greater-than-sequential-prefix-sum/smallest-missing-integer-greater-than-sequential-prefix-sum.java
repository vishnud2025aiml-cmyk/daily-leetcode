class Solution {
    public int missingInteger(int[] nums) {
        boolean[] exist=new boolean[51];

        for(int x:nums){
            exist[x]=true;
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
        while(sum<51 && exist[sum]==true){
            // if(sum>=51){
            //     return nums[nums.length-1];
            // }
            sum+=1;
        }
        return sum;


    }
}