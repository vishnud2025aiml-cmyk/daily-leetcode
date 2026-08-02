class Solution {
    public boolean predictTheWinner(int[] nums) {
        
        Map<String,Integer> dp=new HashMap<>();
        int val=predict(nums,0,nums.length-1,dp);
        if(val>=0){
            return true;
        }
        return false;
    }

    public int predict(int[] nums,int i,int j,Map<String,Integer> dp){
        if(i==j){
            return nums[i];
        }
        String key=i+","+j;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        int left=nums[i]-predict(nums,i+1,j,dp);
        int right=nums[j]-predict(nums,i,j-1,dp);
        return Math.max(left,right);
    }

}