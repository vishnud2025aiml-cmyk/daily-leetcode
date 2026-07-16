class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            arr[i]=gcd(max,nums[i]);
        }

        Arrays.sort(arr);
        long total=0;
        int l=0;
        int r=n-1;
        while(l<r){
            total+=gcd(arr[r],arr[l]);
            l++;
            r--;
        }
        return total;
    }

    public int gcd(int l,int s){
        while(s!=0){
            int rem=l%s;
            l=s;
            s=rem;
        }
        return l;

    }

}