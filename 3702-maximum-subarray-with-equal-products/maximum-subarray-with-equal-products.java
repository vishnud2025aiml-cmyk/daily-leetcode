class Solution {
    public int maxLength(int[] nums) {
        int res=0;

        for(int i=0;i<nums.length;i++){
            int pro=1;
            int lcm=1;
            int g=0;
            for(int j=i;j<nums.length;j++){
                g=gcd(g,nums[j]);
                lcm=nums[j]*(lcm/gcd(lcm,nums[j]));
                pro*=nums[j];
                if(pro==lcm*g){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;

    }

    public int gcd(int s,int l){
        while(s!=0){
            int rem=l%s;
            l=s;
            s=rem;
        }
        return l;
    }
}