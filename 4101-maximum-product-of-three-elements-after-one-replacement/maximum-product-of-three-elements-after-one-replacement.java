class Solution {
    public long maxProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n=nums.length;
        long pro1=(long)nums[n-1]*nums[n-2];
        if(pro1<0){
            pro1*=(long)-100000;
        }
        else{
            pro1*=(long)100000;
        }

        long pro2=(long)nums[0]*nums[1];
        if(pro2<0){
            pro2*=(long)100000;
        }
        else{
            pro2*=(long)100000;
        }

        long pro3=(long)nums[0]*nums[n-1];
        if(pro3<0){
            pro3*=(long)-100000;
        }
        else{
            pro3*=(long)100000;
        }

        long val=Math.max(pro1,pro2);
        return Math.max(val,pro3);

    }
}