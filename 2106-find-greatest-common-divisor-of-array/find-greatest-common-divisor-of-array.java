class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            if(x<min){
                min=x;
            }
            if(x>max){
                max=x;
            }
        }

        int l=max;
        int s=min;
        while(s!=0){
            int rem=l%s;
            l=s;
            s=rem;
        }
        return l;


    }
}