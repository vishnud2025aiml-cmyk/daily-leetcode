class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            while(l<=r){
                int mid=(l+r)/2;
                int diff=Math.abs(nums[i]-nums[mid]);
                if(diff==k){
                    count++;
                    break;
                }
                else if(diff<k){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return count;
    }
}