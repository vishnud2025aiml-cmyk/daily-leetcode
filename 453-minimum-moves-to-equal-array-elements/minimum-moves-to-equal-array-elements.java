class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            min=Math.min(x,min);
        }

        int moves=0;
        for(int x:nums){
            moves+=(x-min);        }
        return moves;

    }
}