class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums.length/2;
        int check=nums[mid];

        int moves=0;
        for(int x:nums){
            moves+=Math.abs(x-check);
        }
        return moves;

    }
}