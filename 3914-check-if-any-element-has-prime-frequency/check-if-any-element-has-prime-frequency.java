class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int max=0;
        for(int x:nums){
            max=Math.max(x,max);
        }
        int[] freq=new int[max+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(prime(freq[nums[i]])){
                return true;
            }
        }
        return false;
    }

    public boolean prime(int n){
        boolean[] marked=new boolean[n+1];
        for(int i=1;i<=n;i++){
            for(int j=i;i+j+2*i*j<=n;j++){
                marked[i+j+2*i*j]=true;
            }
        }
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=1;i<=n;i++){
            if(!marked[i]){
                if(2*i+1==n){
                    return true;
                }
            }
        }
        return false;
    }

}