class Solution {
    public int minStartValue(int[] nums) {
        int mn=Integer.MAX_VALUE;
        int sum=0;
        for(int x:nums){
            sum+=x;
            mn=Math.min(sum,mn);
        }

        if(mn>=1){
            return 1;
        }
        return 1-mn;

    }
}