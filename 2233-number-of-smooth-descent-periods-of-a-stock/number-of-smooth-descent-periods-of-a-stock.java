class Solution {
    public long getDescentPeriods(int[] prices) {
        long res=prices.length;
        int left=0;
        int right=1;

        while(right<prices.length){
            int diff=prices[right-1]-prices[right];
            if(diff==1){
                
                res+=right-left;
                right++;
            }
            else{
                
                left=right;
                right++;
            }
        }
        return res;

    }
}