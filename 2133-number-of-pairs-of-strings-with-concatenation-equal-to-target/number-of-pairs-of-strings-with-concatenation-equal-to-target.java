class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            String x1=nums[i];
            for(int j=0;j<nums.length;j++){
                String x2=nums[j];
                if(i!=j && target.equals(x1+x2)){
                    count++;
                }
            }
        }
        return count;
    }
}