class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();

        int n=nums.length;

        for(int x:nums){
            mp.put(x,0);
        }

        for(int i=1;i<=n;i++){
            if(mp.get(i)==null){
                return i;
            }
        }
        return n+1;
        

    }
}