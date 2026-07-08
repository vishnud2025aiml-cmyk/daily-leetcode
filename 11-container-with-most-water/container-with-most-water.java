class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;

        int mx=0;

        while(left<right){
            int l1=height[left];
            int r1=height[right];

            if(l1<r1){
                mx=Math.max(mx,l1*(right-left));
                left++;
            }
            else{
                mx=Math.max(mx,r1*(right-left));
                right--;
            }

        }
        return mx;

    }
}